package com.ecommerce.dto;

public class DepartmentDto {

  private int id;
  private String department;
  private boolean active;
  
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
  
  public boolean isActive() {
    return active;
  }
  
  public void setActive(boolean active) {
    this.active = active;
  }
    
}
