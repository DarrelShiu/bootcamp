package src;

public class NotFoundException extends Exception {
    private int code;

  public NotFoundException(SysError sysError) {
    super(sysError.getMessage());
    this.code = sysError.getCode();
  }

  public int getCode() {
    return this.code;
  }
}
