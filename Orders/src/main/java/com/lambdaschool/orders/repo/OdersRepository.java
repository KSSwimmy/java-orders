package com.lambdaschool.orders.repo;

import com.lambdaschool.orders.model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Long>
{
}