package com.lambdaschool.orders.repo;

import com.lambdaschool.orders.model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long>
{
    Customers findByCustname(String name);

    //    Customers findByAgent_Agentcode(long id);
}
