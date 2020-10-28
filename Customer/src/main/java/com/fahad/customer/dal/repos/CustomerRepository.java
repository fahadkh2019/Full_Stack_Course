package com.fahad.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.fahad.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
