package Ex2;

public class ExceptionIOErr extends Exception {
    String message;

    public ExceptionIOErr(String message) {
        super(message);
        this.message = message;
    }
}
