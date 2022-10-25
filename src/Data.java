import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Data {
    private Data() {
    }
 //   этот метод выбрасывает исключение и завершает программу
//    public static boolean inputLog() throws WrongPasswordException, WrongLoginException {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите логин:");
//        String login = scan.next();
//        if (login.matches("^[a-zA-Z0-9]+$") && (login.length() > 1 && login.length()<20)){
//            System.out.println("Введите пароль:");
//            String password = scan.next();
//            if (password.matches("^[a-zA-Z0-9]+$") && (password.length() > 1 && password.length() < 20)) {
//                System.out.println("Подтвердите пароль:");
//                String confirmPassword = scan.next();
//                if (confirmPassword.equals(password)) {
//                    System.out.println("Труууу ну то есть true");
//                    return true;
//                }else throw  new WrongPasswordException("Пароли не совпадают");
//            }else throw  new WrongPasswordException("Недопустимые символы в пароле");
//        } else  throw new WrongLoginException("Недопустимые символы в логине");
//    }

        public static void inputLog() {
            Scanner scan = new Scanner(System.in);

            System.out.println("Введите логин:");
            String login = scan.next();
            try {
                if (!login.matches("^[a-zA-Z0-9_]+$") && (login.length() > 1 && login.length() < 20))     //фигурные скобки после if не стал ставить, путают
                    throw new WrongLoginException("Недопустимые символы в логине");
            }  catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Введите пароль:");
            String password = scan.next();
            try {
                if (!password.matches("^[a-zA-Z0-9_]+$") && (password.length() > 1 && password.length() < 20))
                    throw new WrongPasswordException("Недопустимые символы в пароле");
            }  catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Повторите пароль");
            String confirmPassword = scan.next();
            try {
                if (!confirmPassword.equals(password))
                    throw new WrongPasswordException(" Пароли не совпадают");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }








}
