package com.example.customer.controller;

import com.example.customer.entity.Country;
import com.example.customer.entity.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customer")
public class JobController {

    @Autowired
    CustomerService customerService;


    @GetMapping("/hello")
    public String returnString() {
        return "Helllo world from Customer app";
    }


    @GetMapping("/getCountries")
    public List<Country> getCountries() throws Exception {
        return customerService.getListOfCountries();
    }

    @GetMapping("/byCountry/{country}")
    public ResponseEntity<List<Customer>> getCustomersByCountry(@PathVariable String country) {
        List<Customer> customers = customerService.getCustomersByCountry1(country);
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/helloTest")
    public String testFnc() {
        return customerService.testFction();
    }
}


