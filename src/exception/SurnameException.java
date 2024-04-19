package exception;

public class SurnameException extends RuntimeException {
    private final String message;

    public SurnameException(String message) {
        super(message);
        this.message = message;
    }
}
