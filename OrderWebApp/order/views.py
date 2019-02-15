import json

from django.http import HttpResponse
from django.shortcuts import render
from rest_framework.response import Response
from rest_framework.views import APIView

from .serializers import *


def index(request):
	return render(request, "order/index.html", {})


def viewOrder(request):
	return render(request, "order/order.html")


def viewRestaurants(request):
	return render(request, "order/restaurants.html", {})


def submitOrder(request):
	print(request.method)
	json_data = json.loads((dict(request.GET)['data'][0]))
	print(json_data)
	insertIntoOrderTable(json_data)
	return HttpResponse("Order Placed")


def insertIntoOrderTable(json_data):
	order = OrderEntity()
	order.branch_id = json_data['branch_id']
	order.item_id = json_data['item_id']
	order.user_id = json_data['user_id']
	order.restaurant_id = json_data['restaurant_id']
	order.save()


class RestaurantList(APIView):

	def get(self, request):
		rest_list = Restaurant.objects.all()
		print(rest_list)
		serializer = RestaurantSerializer(rest_list, many=True)
		print(serializer)
		return Response(serializer.data)

	def post(self, request):
		pass


class RestaurantBranchList(APIView):

	def get(self, request):
		rest_name = json.loads((dict(request.GET)['data'][0]))['restaurant_name']
		branch_list = RestaurantBranch.objects.filter(restaurant_id__restaurant_name=rest_name)
		serializer = RestaurantBranchSerializer(branch_list, many=True)
		return Response(serializer.data)

	def post(self, request):
		pass


class RestaurantMenuEntryList(APIView):

	def get(self, request):
		rest_name = json.loads((dict(request.GET)['data'][0]))['restaurant_name']
		item_list = RestaurantMenuEntry.objects.filter(restaurant_id__restaurant_name=rest_name)
		serializer = RestaurantMenuEntrySerializer(item_list, many=True)
		return Response(serializer.data)

	def post(self, request):
		pass
