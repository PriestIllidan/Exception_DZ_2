public class Task_DZ_03 {
    /*
    1. Дан следующий код, исправьте его там, где требуется
    (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
     */

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(3, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException e) { // добавил еще одно высокоуровневое исключение
            System.out.println(e.getClass());
        } catch (Exception ex) { // Прородительский класс в конец кода, заменил просто на Exception
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) { // вообще убрал throws FileNotFoundException
        System.out.println(a + b);
    }
}
