package com.ecommerce.http.response;

import com.ecommerce.http.ResponseBody;
import com.ecommerce.model.Department;

public class DepartmentResponse extends ResponseBody {
  
  private Iterable<Department> departments;
  
  public Iterable<Department> getDepartments() {
    return departments;
  }

  public void setDepartments(Iterable<Department> departments) {
    this.departments = departments;
  }
  
}
