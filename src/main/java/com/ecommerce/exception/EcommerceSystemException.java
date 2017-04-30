package com.ecommerce.exception;

/**
 * Exception caused in system failture
 *
 * @author Raul Flores
 * @version 0.1.0
 *
 */
public class EcommerceSystemException extends EcommerceException {

  /**
   * Serial
   */
  private static final long serialVersionUID = 3716065029232651273L;
  
  /**
   * Empty constructor
   */
  public EcommerceSystemException() {
    super();
  }
  
  /**
   * Constructor with message
   * @param message
   */
  public EcommerceSystemException(String message) {
    super(message);
  }
  
  /**
   * Constructor with message and exception
   */
  public EcommerceSystemException(String message, Exception e) {
    super(message, e);
  }

}

