package com.example.demomongo;

import com.example.demomongo.model.Customer;
import com.example.demomongo.repository.CustomerRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoMongoApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void mongoCrudOperationsTest() {
        customerRepository.deleteAll();
        customerRepository.save(new Customer("1","Sunil", "Keyal"));
        customerRepository.save(new Customer());
        assertEquals(2, customerRepository.count());
        assertTrue(customerRepository.existsById("1"));
        assertNotNull(customerRepository.findCustomerByFirstName("Sunil"));
        assertNull(customerRepository.findCustomerByFirstName("Does Not Exist"));
        customerRepository.deleteAll();
    }
}
