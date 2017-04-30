package com.ecommerce.utils;

/**
 * Constants to be used in abstract classes
 *
 * @author Raul Flores
 *
 */
public abstract class ServiceConstants {

  /**
   * Empty constructor
   */
  private ServiceConstants() {
    super();
  }

  public static final String FAIL_GET_DB_DATA = "Fail to get the DB data. ";
  public static final String INVALID_SEARCH_CRITERIA = "Invalid Search Criteria. ";
  public static final String RESPONSE_OK = "Ok";
  public static final String RESPONSE_ACCEPTED = "Accepted";
  public static final String RESPONSE_FAILED = "Failed";
  public static final String RESPONSE_FAIL = "Fail";
  public static final String DETAILS_SUCCESS = "Success";
  public static final String DOCUMENT_NOT_FOUND = "Document not found";
  public static final String DOCUMENT_INVALID_STATUS = "Document not proccesed as it is not in on hold status";
  public static final String DETAILS_ACCEPTED = "Not all documents were processed due an incorrent initial status or any other error";
  public static final String DETAILS_MDOC_NOT_FOUND = "Master Document not found";
  public static final String RESPONSE_SUCCESS = "Success";
  public static final String MASTER_DOCUMENT_NOT_FOUND = "Master document not found";
  public static final String MASTER_DOCUMENT_INVALID_STATUS = "Master document not proccesed as it is not in arrived status";
  public static final String NOT_ALL_DOCUMENTS_PROCESSED = "Not all documents were processed due an incorrect initial status or any other error";
  public static final String BAD_REQUEST = "Bad";
  public static final String DETAILS_DUPLICATED = "Data was not processed due a duplication or any other error";
  public static final String DETAILS_NOT_UPDATED = "An exception occurred while processing the current action. Please contact your System Administrator.";
  public static final String DETAILS_UPDATED = "Data updated successfully";

}