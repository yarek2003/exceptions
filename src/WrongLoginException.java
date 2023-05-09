public class WrongLoginException extends RuntimeException {
    private static final String DEFAULT_MESSAGE = "Логин не должен быть длинне 20 символов";
    public WrongLoginException() {
        this(DEFAULT_MESSAGE);
    }
    public WrongLoginException(String message) {
        super(message);
    }
}
