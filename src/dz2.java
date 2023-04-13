import java.util.InputMismatchException;
import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        // task 1
        System.out.println("Результат: " + enteringFractionalNumber());
        // task 2
        taskTwo(new int[]{4, 5, 6, 7, 5, 3, 23,}, 5);
        // task 4
        System.out.println("Результат (не пустая строка): " + consoleNotEmptyInput());
    }
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
    */
    public static float enteringFractionalNumber(){
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите дробное число: ");
                return scanner.nextFloat();

            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Вы ввели не число.");
            }
        }
    }


    // Задание 2
    public static void taskTwo(int[] intArray, double d) {
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        }
    }

    //    Задание 3

//public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//        }  catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//        catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }
//    }
//
//    public static void printSum(Integer a, Integer b) {
//        System.out.println(a + b);
//    }

    //Task4
    public static String consoleNotEmptyInput() {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите не пустую строку: ");
                String result = scanner.nextLine();
                if ("".equals(result)) {
                    throw new RuntimeException();
                }
                return result;

            } catch (Exception e) {
                System.out.println("Ошибка. Вы ввели пустую строку");
            }
        }
    }
}

