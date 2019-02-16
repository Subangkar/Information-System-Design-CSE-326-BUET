from datetime import datetime

from django.db import models


# Create your models here.
class OrderEntity(models.Model):
    user_id = models.CharField(max_length=12)
    item_id = models.CharField(max_length=15)
    restaurant_id = models.CharField(max_length=15)
    branch_id = models.CharField(max_length=15)
    delivery_id = models.CharField(max_length=15)
    payment_id = models.CharField(max_length=15)
    order_date = models.DateTimeField(default=datetime.now, blank=True)

    def __str__(self):
        return self.user_id + " " + self.item_id + " " + \
               self.restaurant_id + " " + self.delivery_id + " " + \
               self.payment_id + " " + str(self.order_date)


class Restaurant(models.Model):
    restaurant_name = models.CharField(max_length=75)

    def __str__(self):
        return self.restaurant_name


class RestaurantBranch(models.Model):
    restaurant_id = models.ForeignKey(Restaurant, on_delete=models.CASCADE)
    branch_name = models.CharField(max_length=75)


class RestaurantMenuEntry(models.Model):
    restaurant_id = models.ForeignKey(Restaurant, on_delete=models.CASCADE)
    entry_name = models.CharField(max_length=100)
    price = models.FloatField()

    def __str__(self):
        return self.entry_name + " " + \
               str(self.price)
