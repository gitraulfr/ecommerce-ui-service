package com.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.model.Department;

public interface DepartmentDao extends CrudRepository<Department, Integer> {
    
}
