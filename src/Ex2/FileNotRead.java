package Ex2;

public class FileNotRead extends Exception{
    String message;

    public FileNotRead(String message) {
        super(message);
        this.message = message;
    }
}
