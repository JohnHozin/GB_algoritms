package exceptions.lesson_3_hw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        programStart();

    }

    // Иванов Иван Иванович 01.01.1991 89271112233 m

    public static void writeInFile(String pathWrite, String text) throws IOException {
        try (FileWriter writer = new FileWriter(pathWrite, true);
             BufferedWriter in = new BufferedWriter(writer)) {
            in.write(text + "\n");
        }
    }

    public static void programStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел: Фамилия, Имя, Отчество, дата рождения(формат dd.mm.yyyy), номер телефона(только цифры), пол(f или m)");
        while (scanner.hasNextLine()) {
            String inputText = scanner.nextLine();
            if (inputText.contains(" ")) {
                String[] text = inputText.split(" ");
                if (text.length == 6) {
                    try {
                        if (!checkString(text[0])) {
                            throw new RuntimeException("Неверная запись Фамилии!");
                        } else if (!checkString(text[1])) {
                            throw new RuntimeException("Неверная запись Имени!");
                        } else if (!checkString(text[2])) {
                            throw new RuntimeException("Неверная запись Отчества!");
                        } else if (!checkDataBirthday(text[3])) {
                            throw new RuntimeException("Неверный формат даты рождения!");
                        } else if (!checkPhone(text[4])) {
                            throw new RuntimeException("Неверный номер телефона!");
                        } else if (!checkMale(text[5])) {
                            throw new RuntimeException("Неверно указан пол!");
                        }

                        String path = "D:/javaProjects/GB_algoritms/src/exceptions/lesson_3_hw/" + text[0] + ".txt";
                        writeInFile(path, inputText);

                        System.out.println("Запись в файл выполнена успешно!!!");
                        return;
                    } catch (NumberFormatException e) {
                        System.err.println("В дате рождения не числа!");
                        System.out.println("Введите заново:");
                    } catch (RuntimeException e) {
                        System.err.println(e.getMessage());
                        System.out.println("Введите заново:");
                    } catch (IOException e) {
                        System.err.println("Ошибка в записи");
                    }
                } else if (text.length < 6) {
                    System.err.println("Введите больше данных!");
                } else {
                    System.err.println("Введите меньше данных!");
                }
            } else {
                System.err.println("Введите данные через пробел!");
            }
        }
    }

    public static boolean checkString(String string) {
        return !string.equals("") && string.matches("^[a-zA-Zа-яА-Я]*$");
    }

    public static boolean checkDataBirthday(String string) throws NumberFormatException {
        if (string.contains(".")) {
            String[] data = string.split("\\.");
            if (data.length != 3 || data[0].length() != 2 || data[1].length() != 2 || data[2].length() != 4) {
                return false;
            }
            Integer.parseInt(data[0]);
            Integer.parseInt(data[1]);
            Integer.parseInt(data[2]);
        } else {
            return false;
        }
        return true;
    }

    public static boolean checkPhone(String string) throws RuntimeException {
        try {
            Long.parseLong(string);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Ошибка в номере телефона!");
        }
        return string.length() == 11;
        //string.matches("^\\d*$")
    }

    private static boolean checkMale(String string) {
        return string.equals("f") || string.equals("m");
    }
}
