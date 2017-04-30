package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ecommerce.dao.DepartmentDao;
import com.ecommerce.dto.DepartmentDto;
import com.ecommerce.exception.EcommerceSystemException;
import com.ecommerce.http.Response;
import com.ecommerce.http.response.DepartmentResponse;
//import com.ecommerce.dto.CatalogDto;
//import com.ecommerce.dto.DepartmentDto;
//import com.ecommerce.http.response.DepartmentResponse;
//import com.ecommerce.utils.ServiceConstants;
import com.ecommerce.model.Department;
import com.ecommerce.utils.ServiceConstants;

@Component
public class DepartmentService {
  
  @Autowired
  DepartmentDao departmentDao;
  
  public ResponseEntity<Response> findAll() throws EcommerceSystemException {
    Iterable<Department> deps = departmentDao.findAll();
    
    if(deps == null) {
      return new ResponseEntity<>(null, HttpStatus.OK);
    }
      
    List<DepartmentDto> departments = new ArrayList<>();
    
    for(Department department : deps) {
      DepartmentDto ddto = new DepartmentDto();
      ddto.setId(department.getNiddepartment());
      ddto.setDepartment(department.getSdepartment());
      ddto.setActive(department.getBisactive());
      departments.add(ddto);
    }
    
    DepartmentResponse response = new DepartmentResponse();
    response.setResult(ServiceConstants.DETAILS_SUCCESS);
    response.setDepartments(departments);
    
    ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
    
    return responseEntity;
  }
  
  public ResponseEntity<Response> findOne(Integer id) throws EcommerceSystemException {
    Department department = departmentDao.findOne(id);
    
    if(department == null) {
      return new ResponseEntity<>(null, HttpStatus.OK);
    }
    
    DepartmentResponse response = new DepartmentResponse();
    response.setResult(ServiceConstants.DETAILS_SUCCESS);
    
    List<DepartmentDto> departments = new ArrayList<>();
    DepartmentDto ddto = new DepartmentDto();
    ddto.setId(department.getNiddepartment());
    ddto.setDepartment(department.getSdepartment());
    ddto.setActive(department.getBisactive());
    departments.add(ddto);
    
    response.setDepartments(departments);
    
    ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
    
    return responseEntity;
    
  }
  
  public ResponseEntity<Response> findByName(String sdepartment) {
    Iterable<Department> deps = departmentDao.findBySdepartment(sdepartment);
    
    if(deps == null) {
      return new ResponseEntity<>(null, HttpStatus.OK);
    }
      
    List<DepartmentDto> departments = new ArrayList<>();
    
    for(Department department : deps) {
      DepartmentDto ddto = new DepartmentDto();
      ddto.setId(department.getNiddepartment());
      ddto.setDepartment(department.getSdepartment());
      ddto.setActive(department.getBisactive());
      departments.add(ddto);
    }
    
    DepartmentResponse response = new DepartmentResponse();
    response.setResult(ServiceConstants.DETAILS_SUCCESS);
    response.setDepartments(departments);
    
    ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, HttpStatus.OK);
    
    return responseEntity;
  }
  
}
