package com.ecommerce.http.response;

import com.ecommerce.dto.CatalogDto;

public class DepartmentResponse {
  
  private String result;
  private CatalogDto catalog;

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
  
  public CatalogDto getCatalog() {
    return catalog;
  }

  public void setCatalog(CatalogDto catalog) {
    this.catalog = catalog;
  }

}
