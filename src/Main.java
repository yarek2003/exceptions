
public class Main {
    public static void main(String[] args) {
        String login = "login_A1";
        String password = "password_A11111111111111110";
        String confirmPassword = "password_A1*";

        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException t) {
            System.out.println(t.getMessage());
        } finally {
            System.out.println("Логин и пароль обработаны");
        }
    }
    public static boolean check(String login, String password, String confirmPassword) {
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Логин содержит некорректные символы");
        }

        if (login.length() > 20) {
            throw new WrongLoginException();
        }

        if (!password.matches("\\w+")) {
            throw new RuntimeException("Пароль содержит некорректные символы");
        }

        if (!(password.length() < 20)) {
            throw new WrongPasswordException("Пароль не должен быть длинне 20 символов");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        return true;
    }
}