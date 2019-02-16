from django.contrib import admin
from .models import *


# Register your models here.
admin.site.register(OrderEntity)
admin.site.register(RestaurantBranch)
admin.site.register(Restaurant)
admin.site.register(RestaurantMenuEntry)