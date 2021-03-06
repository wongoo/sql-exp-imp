package jtool.sql.imp;

/**
 * @author Geln Yang
 * @version 1.0
 */
public final class ImportGlobals {

  private static boolean continueWhenError = false;

  private static boolean continueWhenPkFkError = false;

  private static int batchsize = 2000;

  private static int maxBulksize = 500000;

  private static boolean autoCommit = false;

  private static boolean validFirst = false;

  private static boolean changeNegativeToZero = false;

  public static boolean isContinueWhenError() {
    return continueWhenError;
  }

  public static void setContinueWhenError(boolean continueWhenError) {
    ImportGlobals.continueWhenError = continueWhenError;
  }

  public static boolean isContinueWhenPkFkError() {
    return continueWhenPkFkError;
  }

  public static void setContinueWhenPkFkError(boolean continueWhenPkFkError) {
    ImportGlobals.continueWhenPkFkError = continueWhenPkFkError;
  }

  public static int getBatchsize() {
    return batchsize;
  }

  public static void setBatchsize(int batchsize) {
    ImportGlobals.batchsize = batchsize;
  }

  public static boolean isAutoCommit() {
    return autoCommit;
  }

  public static void setAutoCommit(boolean autoCommit) {
    ImportGlobals.autoCommit = autoCommit;
  }

  public static boolean isValidFirst() {
    return validFirst;
  }

  public static void setValidFirst(boolean validFirst) {
    ImportGlobals.validFirst = validFirst;
  }

  public static int getMaxBulksize() {
    return maxBulksize;
  }

  public static void setMaxBulksize(int maxBulksize) {
    ImportGlobals.maxBulksize = maxBulksize;
  }

  public static boolean isChangeNegativeToZero() {
    return changeNegativeToZero;
  }

  public static void setChangeNegativeToZero(boolean changeNegativeToZero) {
    ImportGlobals.changeNegativeToZero = changeNegativeToZero;
  }

}
