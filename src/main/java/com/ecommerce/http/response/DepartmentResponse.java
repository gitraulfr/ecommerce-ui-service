package com.ecommerce.http.response;

import java.util.List;

import com.ecommerce.dto.DepartmentDto;
import com.ecommerce.http.Response;

public class DepartmentResponse extends Response {
  
  private List<DepartmentDto> departments;
  
  public List<DepartmentDto> getDepartments() {
    return departments;
  }

  public void setDepartments(List<DepartmentDto> departments) {
    this.departments = departments;
  }
  
}
