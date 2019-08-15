package com.lambdaschool.orders.services;

import com.lambdaschool.orders.repo.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrdersServiceImp implements OrdersService
{
    @Autowired
    private OrdersRepository ordersrepos;
}