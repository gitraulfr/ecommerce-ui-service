package com.ecommerce.dto;

public class DepartmentDto {

  private int parentid;
  private int id;
  private String department;
  
  public int getParentid() {
    return parentid;
  }
  public void setParentid(int parentid) {
    this.parentid = parentid;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }
  
}
