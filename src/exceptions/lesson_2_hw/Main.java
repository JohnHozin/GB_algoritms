package exceptions.lesson_2_hw;

import java.util.Scanner;

/**
 * 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 * <p>
 * 2. Если необходимо, исправьте данный код (задание 2
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 * <p>
 * 3. Дан следующий код, исправьте его там, где требуется (задание 3
 * https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 * <p>
 * 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Main {
    public static void main(String[] args) {
//        System.out.println(exception1_var1());
        System.out.println(exception1_var2());
    }

    // принимает ввод только с запятой (12,23) и целые числа, не реагирует на ввод пустой строки
    public static float exception1_var1() {
        Scanner scanner = new Scanner(System.in);
        boolean cycle = true;
        float inputNumber = 0;
        while (cycle) {
            System.out.println("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                inputNumber = scanner.nextFloat();
                System.out.println("Число принято.");
                cycle = false;
            } else {
                scanner.nextLine();
                System.out.println("Введены неверные данные!");
            }
        }
        return inputNumber;
    }

    // принимает ввод только с точкой (12.12) и целые числа
    public static float exception1_var2() {
        Scanner scanner = new Scanner(System.in);
        boolean cycle = true;
        float inputNumber = 0;
        while (cycle) {
            System.out.println("Введите дробное число: ");
            String inputText = scanner.nextLine();
            if (!inputText.equals("")){
                try {
                    inputNumber = Float.parseFloat(inputText);
                    System.out.println("Число принято.");
                    cycle = false;
                } catch (Exception e){
                    System.out.println("Введены неверные данные!");
                }
            } else {
                System.out.println("Введена пустая строка!");
            }
        }
        return inputNumber;
    }
}
