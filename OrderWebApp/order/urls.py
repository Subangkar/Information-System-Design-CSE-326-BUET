from django.urls import path
from order import views
from rest_framework.urlpatterns import format_suffix_patterns

urlpatterns = [
	path('', views.viewOrder),
	path('restaurants.html', views.viewRestaurants),
	path('index.html', views.index),
	path('order/', views.viewOrder),
	path('submitOrder/', views.submitOrder),
	path('allRestaurantList/', views.RestaurantList.as_view()),
	path('menuEntryForRestaurant/', views.RestaurantMenuEntryList.as_view()),
	path('branchListForRestaurant/', views.RestaurantBranchList.as_view())

]

urlpatterns = format_suffix_patterns(urlpatterns)
