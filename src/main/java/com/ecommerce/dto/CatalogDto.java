package com.ecommerce.dto;

import java.util.List;
import com.ecommerce.http.response.DepartmentResponse;

public class CatalogDto {
  
  private int arraysize;
  private List<DepartmentDto> departments;
  
  public List<DepartmentDto> getDepartments() {
    return departments;
  }

  public void setDepartments(List<DepartmentDto> departments) {
    this.departments = departments;
  }

  public int getArraysize() {
    return arraysize;
  }

  public void setArraysize(int arraysize) {
    this.arraysize = arraysize;
  }

}
