import java.util.Scanner;

public class Task_DZ_01 {
    /* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
    необходимо повторно запросить у пользователя ввод данных.
    */
    public static void main(String[] args) {
        System.out.println(Number());
    }

    public static float Number() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите число: ");
            float number = scanner.nextFloat();
            return number;
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        return Number();
    }
}
