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
import com.ecommerce.http.Response;

import com.ecommerce.service.DepartmentService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/ecommerce")
public class DepartmentController {
  
  @Autowired
  DepartmentService departmentService;

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public String test() {
    return "DepartmentController test success!";
  }
  
  @RequestMapping(value = "findAll/{token}", method = RequestMethod.POST)
  public ResponseEntity<Response> findAll(@PathVariable("token") String token) throws EcommerceSystemException {
    return departmentService.findAll();
  }
  
  @RequestMapping(value = "findOne/{token}/{id}", method = RequestMethod.POST)
  public ResponseEntity<Response> findOne(@PathVariable("token") String token, @PathVariable("id") Integer id) throws EcommerceSystemException {
    return departmentService.findOne(id);
  }
  
  @RequestMapping(value = "findByName/{token}/{name}", method = RequestMethod.POST)
  public ResponseEntity<Response> findByName(@PathVariable("token") String token, @PathVariable("name") String name) throws EcommerceSystemException {
    return departmentService.findByName(name);
  }

}
