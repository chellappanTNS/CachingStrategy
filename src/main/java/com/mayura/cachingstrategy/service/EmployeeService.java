package com.mayura.cachingstrategy.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.CacheEvict;

@Service
public class EmployeeService {

	@Cacheable(value = "employees", key = "'employee-' + #id")
    public String getEmployee(int id) {

        System.out.println("Fetching employee from database...");

        return "Employee-" + id;
    }
    @CachePut(value = "employees", key = "'employee-' + #id")
    public String updateEmployee(int id, String name) {

        System.out.println("Updating employee in database...");

        return name;
    }
    @CacheEvict(value = "employees", key = "'employee-' + #id")
    public void deleteEmployee(int id) {

        System.out.println("Deleting employee from database...");
    }
}