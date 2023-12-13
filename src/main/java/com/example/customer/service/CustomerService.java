package com.example.customer.service;

import com.example.customer.entity.Country;
import com.example.customer.entity.Customer;
import com.example.customer.feign.HelloInterface;
import com.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    HelloInterface helloInterface;

    public List<Country> getListOfCountries() {
        List<Object[]> results = customerRepository.listOfCountries();

        List<Country> countries = results.stream()
                .map(result -> new Country((String) result[0], (Long) result[1]))
                .collect(Collectors.toList());

        return countries;
    }

    public List<Customer> getCustomersByCountry(String country) {
        return customerRepository.listOfCustomerCountry(country);
    };

    public List<Customer> getCustomersByCountry1(String country) {
        return customerRepository.findByCountry(country);
    };

    public String testFction() {
        return helloInterface.helloClient();
    }
}
