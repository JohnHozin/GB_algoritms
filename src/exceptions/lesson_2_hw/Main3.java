package exceptions.lesson_2_hw;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(exception4());
    }

    public static String exception4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String inputText = scanner.nextLine();
        if (inputText.equals("")) {
            throw new RuntimeException("Пустую строку вводить нельзя!");
        }
        return inputText;
    }
}
