package com.ecommerce.exception;

/**
 * Exception caused in Ecommerce failture
 *
 * @author Raul Flores
 * @version 0.1.0
 *
 */
public class EcommerceException extends Exception {

  /**
   * Serial
   */
  private static final long serialVersionUID = 1244773853216415537L;

  /**
   * Empty constructor
   */
  public EcommerceException() {
    super();
  }
  
  /**
   * Constructor with message
   * @param message
   */
  public EcommerceException(String message) {
    super(message);
  }
  
  /**
   * Constructor with message and exception
   * @param message
   * @param e
   */
  public EcommerceException(String message, Exception e) {
    super(message, e);
  }
}

