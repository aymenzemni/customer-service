package com.example.customer.repository;

import com.example.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Customer> {
 //   @Query("SELECT DISTINCT country FROM Customer ORDER BY country ASC")
    @Query("SELECT country, COUNT(*) AS occurrence_count FROM Customer GROUP BY country ORDER BY country ASC")
    List<Object[]> listOfCountries();

    @Query("SELECT c FROM Customer c WHERE c.country = :pays")
    List<Customer> listOfCustomerCountry(@Param("pays") String pays);

    List<Customer> findByCountry(String pays);
}
