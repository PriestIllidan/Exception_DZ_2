import java.util.ArrayList;
import java.util.Scanner;

public class Task_DZ_04 {
    /*
    2.Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        String str = checkEmptyString();
        System.out.println(str);
    }

    public static String checkEmptyString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String str = scanner.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Строка не может быть null");
        }
        scanner.close();
        return str;

    }
}
