package com.ecommerce.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.ecommerce.dao.DepartmentDao;
import com.ecommerce.exception.EcommerceSystemException;
import com.ecommerce.http.Response;
import com.ecommerce.http.response.DepartmentResponse;

import com.ecommerce.model.Department;
import com.ecommerce.utils.ServiceConstants;

@Component
public class DepartmentService {

  @Autowired
  DepartmentDao departmentDao;

  public ResponseEntity<Response> findAll() throws EcommerceSystemException {
    Iterable<Department> departments = departmentDao.findAll();

    if (departments == null) {
      return new ResponseEntity<>(null, HttpStatus.OK);
    }

    DepartmentResponse response = new DepartmentResponse();
    response.setResult(ServiceConstants.DETAILS_SUCCESS);
    response.setDepartments(departments);

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  public ResponseEntity<Response> findOne(Integer id) throws EcommerceSystemException {
    Department department = departmentDao.findOne(id);

    if (department == null) {
      return new ResponseEntity<>(null, HttpStatus.OK);
    }

    DepartmentResponse response = new DepartmentResponse();
    response.setResult(ServiceConstants.DETAILS_SUCCESS);

    Iterable<Department> departments = Arrays.asList(department);
    response.setDepartments(departments);

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  public ResponseEntity<Response> findByName(String name) throws EcommerceSystemException {
    Iterable<Department> departments = departmentDao.findByName(name);

    if (departments == null) {
      return new ResponseEntity<>(null, HttpStatus.OK);
    }

    DepartmentResponse response = new DepartmentResponse();
    response.setResult(ServiceConstants.DETAILS_SUCCESS);
    response.setDepartments(departments);

    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  public Response save(Department department) throws EcommerceSystemException {
    departmentDao.save(department);

    Response response = new Response();
    response.setResult(ServiceConstants.DETAILS_SUCCESS);
    return response;
  }

  public Response deleteById(Integer id) throws EcommerceSystemException {
    departmentDao.delete(id);
    Response response = new Response();
    response.setResult(ServiceConstants.DETAILS_SUCCESS);
    return response;
  }

}
