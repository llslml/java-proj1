package exception;

public class NameValidation extends RuntimeException {
    private final String message;

    public NameValidation(String message) {
        super(message);
        this.message = message;
    }

}
