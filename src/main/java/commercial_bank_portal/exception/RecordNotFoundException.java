package commercial_bank_portal.exception;

public class RecordNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -6638849627494498004L;

    public RecordNotFoundException(String message) {
        super(message);
    }
}

