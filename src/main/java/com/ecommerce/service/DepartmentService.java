package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecommerce.dto.CatalogDto;
import com.ecommerce.dto.DepartmentDto;
import com.ecommerce.http.response.DepartmentResponse;

import com.ecommerce.repo.DepartmentRepository;
import com.ecommerce.utils.ServiceConstants;
import com.ecommerce.model.Department;

@Component
public class DepartmentService {
  
  @Autowired
  DepartmentRepository repository;
  
  public Iterable<Department> findAll() {
    Iterable<Department> departments = repository.findAll();
        
    return departments;
  }
  
}
