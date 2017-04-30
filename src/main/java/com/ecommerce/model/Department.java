package com.ecommerce.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department implements Serializable {

  /**
   * Serial
   */
  private static final long serialVersionUID = 2910962071118198333L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int niddepartment;
  
  @Column(name = "sdepartment")
  private String sdepartment;
  
  @Column(name = "bisactive")
  private String bisactive;
  
  protected Department() { }
  
  public Department(String sdepartment, String bisactive) {
    this.sdepartment = sdepartment;
    this.bisactive = bisactive;
  }
  
  public int getNiddepartment() {
    return niddepartment;
  }
  
  public void setNiddepartment(int niddepartment) {
    this.niddepartment = niddepartment;
  }
  
  public String getSiddepartment() {
    return sdepartment;
  }
  
  public void setSiddepartment(String siddepartment) {
    this.sdepartment = siddepartment;
  }
  
  public String getBisactive() {
    return bisactive;
  }
  
  public void setBisactive(String bisactive) {
    this.bisactive = bisactive;
  }
  
}
  
