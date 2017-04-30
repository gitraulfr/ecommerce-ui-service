package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Base class for controllers
 * @author Raul Flores
 * @version 1.0.0
 */
public abstract class BaseController {
  
  @Autowired
  protected DepartmentController departmentController;

}
