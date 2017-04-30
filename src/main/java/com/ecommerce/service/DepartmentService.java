package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecommerce.dao.DepartmentDao;
//import com.ecommerce.dto.CatalogDto;
//import com.ecommerce.dto.DepartmentDto;
//import com.ecommerce.http.response.DepartmentResponse;
//import com.ecommerce.utils.ServiceConstants;
import com.ecommerce.model.Department;

@Component
public class DepartmentService {
  
  @Autowired
  DepartmentDao repository;
  
  public Iterable<Department> findAll() {
    return repository.findAll();
  }
  
  public Department findOne(Integer id) {
    return repository.findOne(id);
  }
  
}
