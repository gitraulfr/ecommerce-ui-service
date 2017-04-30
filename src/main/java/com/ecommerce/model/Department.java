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
  @Column(name = "niddepartment")
  private int id;
  
  @Column(name = "sdepartment")
  private String name;
  
  @Column(name = "bisactive")
  private boolean active;
  
  /**
   * Empty constructor
   */
  protected Department() { }
  
  /**
   * Constructor with parameters
   * @param sdepartment
   * @param bisactive
   */
  public Department(String name, boolean active) {
    this.name = name;
    this.active = active;
  }
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }
  
}
  
