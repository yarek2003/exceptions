public class WrongPasswordException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Пароль не совпадает";
    public WrongPasswordException() {
        this(DEFAULT_MESSAGE);
    }
    public WrongPasswordException(String message) {
        super(message);
    }
}

