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
  private boolean bisactive;
  
  /**
   * Empty constructor
   */
  protected Department() { }
  
  /**
   * Constructor with parameters
   * @param sdepartment
   * @param bisactive
   */
  public Department(String sdepartment, boolean bisactive) {
    this.sdepartment = sdepartment;
    this.bisactive = bisactive;
  }
  
  public int getNiddepartment() {
    return niddepartment;
  }
  
  public void setNiddepartment(int niddepartment) {
    this.niddepartment = niddepartment;
  }
  
  public String getSdepartment() {
    return sdepartment;
  }
  
  public void setSdepartment(String sdepartment) {
    this.sdepartment = sdepartment;
  }
  
  public boolean getBisactive() {
    return bisactive;
  }
  
  public void setBisactive(boolean bisactive) {
    this.bisactive = bisactive;
  }
  
}
  
