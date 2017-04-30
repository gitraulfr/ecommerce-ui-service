package com.ecommerce.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.exception.EcommerceSystemException;
import com.ecommerce.http.request.criteria.DepartmentSearchCriteria;
import com.ecommerce.http.response.DepartmentResponse;
import com.ecommerce.model.Department;
import com.ecommerce.utils.ServiceConstants;

import io.swagger.annotations.ApiOperation;

import com.ecommerce.service.DepartmentService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/ecommerce")
public class DepartmentController extends BaseController {
  
  @Autowired
  DepartmentService departmentService;

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public String test() {
    return "DepartmentController test success!";
  }
  
  @RequestMapping(value = "findAll", method = RequestMethod.GET)
  public Iterable<Department> findAll() {
    return departmentService.findAll();
  }
    
  @ApiOperation(value = "Return all departments information", nickname = "getAllDepartments", httpMethod = "POST")
  @RequestMapping(value = "/menu/getAllDepartments/{token}", method = RequestMethod.POST, consumes = "application/json",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public DepartmentResponse getAllDepartments(@RequestBody DepartmentSearchCriteria departmentSearchCriteria,
      @PathVariable("token") String token) {
    
    
    
    /*DepartmentResponse response = new DepartmentResponse();
    response.setResult(ServiceConstants.RESPONSE_SUCCESS);

    System.out.println("      sc id: " + departmentSearchCriteria.getId());
    System.out.println("    sc name: " + departmentSearchCriteria.getName());
    System.out.println("sc isactive: " + departmentSearchCriteria.isIsactive());
    
    DepartmentDto d = new DepartmentDto();
    d.setParentid(0);
    d.setId(1);
    d.setDepartment("Vinos y licores");

    DepartmentDto d2 = new DepartmentDto();
    d2.setParentid(0);
    d2.setId(2);
    d2.setDepartment("Cervezas");

    List<DepartmentDto> list = new ArrayList<DepartmentDto>();
    list.add(d);
    list.add(d2);

    CatalogDto c = new CatalogDto();
    c.setArraysize(2);
    c.setDepartments(list);

    System.out.println("token: " + token);

    response.setCatalog(c);

    return response;*/
    return null;
  }

}
