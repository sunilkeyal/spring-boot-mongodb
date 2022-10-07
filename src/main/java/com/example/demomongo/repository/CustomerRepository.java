package com.example.demomongo.repository;

import com.example.demomongo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findCustomerByFirstName(String firstName);

}
