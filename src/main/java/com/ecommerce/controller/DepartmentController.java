package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.exception.EcommerceSystemException;
import com.ecommerce.http.ResponseBody;
import com.ecommerce.model.Department;
import com.ecommerce.service.DepartmentService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/ecommerce/department")
public class DepartmentController {

  @Autowired
  DepartmentService departmentService;

  @RequestMapping(value = "test", method = RequestMethod.GET)
  public String test() {
    return "DepartmentController test success!";
  }

  @RequestMapping(value = "findAll/{token}", method = RequestMethod.POST)
  public ResponseEntity<ResponseBody> findAll(@PathVariable("token") String token) throws EcommerceSystemException {
    return departmentService.findAll();
  }

  @RequestMapping(value = "findOne/{token}/{id}", method = RequestMethod.POST)
  public ResponseEntity<ResponseBody> findOne(@PathVariable("token") String token, @PathVariable("id") Integer id)
      throws EcommerceSystemException {
    return departmentService.findOne(id);
  }

  @RequestMapping(value = "findByName/{token}/{name}", method = RequestMethod.POST)
  public ResponseEntity<ResponseBody> findByName(@PathVariable("token") String token, @PathVariable("name") String name)
      throws EcommerceSystemException {
    return departmentService.findByName(name);
  }

  @RequestMapping(value = "save/{token}", method = RequestMethod.POST)
  public ResponseBody save(@RequestBody Department department) throws EcommerceSystemException {
    return departmentService.save(department);
  }

  @RequestMapping(value = "deleteById/{token}/{id}", method = RequestMethod.DELETE)
  public ResponseBody deleteById(@PathVariable("id") Integer id) throws EcommerceSystemException {
    return departmentService.deleteById(id);
  }
  
}
