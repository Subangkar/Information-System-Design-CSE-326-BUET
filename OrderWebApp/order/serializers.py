from rest_framework import serializers
from .models import *


class RestaurantSerializer(serializers.ModelSerializer):

    class Meta:
        model = Restaurant
        fields = '__all__'


class RestaurantBranchSerializer(serializers.ModelSerializer):

    class Meta:
        model = RestaurantBranch
        fields = '__all__'


class RestaurantMenuEntrySerializer(serializers.ModelSerializer):

    class Meta:
        model = RestaurantMenuEntry
        fields = '__all__'

