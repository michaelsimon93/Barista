public class OutOfStockException extends Exception {
  private static final long serialVersionUID = 1L;

  public OutOfStockException() {}

  public OutOfStockException(String message) {
    super(message);
  }

  public OutOfStockException(Throwable cause) {
    super(cause);
  }

  public OutOfStockException(String message, Throwable cause) {
    super(message, cause);
  }
}
