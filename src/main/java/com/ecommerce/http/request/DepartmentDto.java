package com.ecommerce.http.request;

import com.ecommerce.http.request.criteria.DepartmentSearchCriteria;

public class DepartmentDto {

  private String token;
  private DepartmentSearchCriteria searchcriteria;
  
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }
  public DepartmentSearchCriteria getSearchcriteria() {
    return searchcriteria;
  }
  public void setSearchcriteria(DepartmentSearchCriteria searchcriteria) {
    this.searchcriteria = searchcriteria;
  }
   
    
}
