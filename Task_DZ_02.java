public class Task_DZ_02 {
    /*
    2. Если необходимо, исправьте данный код
    (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    */
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[5]; // Добавили сам массив
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e); // Добавили дополнительный вид возможной ошибки
        }
    }
}
