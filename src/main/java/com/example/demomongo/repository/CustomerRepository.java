package com.example.demomongo.repository;

import com.example.demomongo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findCustomerByFirstName(String firstName);

}
