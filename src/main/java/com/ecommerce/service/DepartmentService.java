package com.ecommerce.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ecommerce.dao.DepartmentDao;
import com.ecommerce.exception.EcommerceSystemException;
import com.ecommerce.http.ResponseBody;
import com.ecommerce.http.response.DepartmentResponse;

import com.ecommerce.model.Department;
import com.ecommerce.utils.ServiceConstants;

@Component
public class DepartmentService {

  @Autowired
  DepartmentDao departmentDao;

  public ResponseEntity<ResponseBody> findAll() throws EcommerceSystemException {
    Iterable<Department> departments = departmentDao.findAll();
    DepartmentResponse response = this.getDepartmentResponse(departments);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  public ResponseEntity<ResponseBody> findOne(Integer id) throws EcommerceSystemException {
    Department department = departmentDao.findOne(id);
   
    if (department == null)
      return new ResponseEntity<>(null, HttpStatus.OK);

    Iterable<Department> departments = Arrays.asList(department);
    DepartmentResponse response = this.getDepartmentResponse(departments);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  public ResponseEntity<ResponseBody> findByName(String name) throws EcommerceSystemException {
    Iterable<Department> departments = departmentDao.findByName(name);
    DepartmentResponse response = this.getDepartmentResponse(departments);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  public ResponseBody save(Department department) throws EcommerceSystemException {
    departmentDao.save(department);
    return this.getResponseBody();
  }
  
  public ResponseBody deleteById(Integer id) throws EcommerceSystemException {
    departmentDao.delete(id);
    return this.getResponseBody();
  }
  
  private DepartmentResponse getDepartmentResponse(Iterable<Department> departments) {
    DepartmentResponse response = new DepartmentResponse();
    response.setResult(ServiceConstants.RESPONSE_SUCCESS);
    response.setDepartments(departments);
    return response;
  }
  
  private ResponseBody getResponseBody() {
    ResponseBody response = new ResponseBody();
    response.setResult(ServiceConstants.DETAILS_SUCCESS);
    return response;
  }

}
