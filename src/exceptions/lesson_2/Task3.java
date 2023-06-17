package exceptions.lesson_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * Запишите в файл следующие строки:
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Константин=?
 * Иван=4
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap).
 * В отдельном методе нужно будет пройти по структуре данных.
 * Если сохранено значение ?, заменить его на соответствующее число.
 * Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами ?.
 */

//public class Task3 {
//   package web_02_TypesExseption;
//
//import java.io.*;
//import java.util.HashMap;
//
//    public class ex_03 {
//        public static void main(String[] args) {
//            HashMap<String, Integer> map = readData("/Users/kalishka82/Documents/" +
//                    "GeekBrains/JAVA_projects/Exceptions/src/main/java/web_02_TypesExseption/names.txt");
//            writeData("/Users/kalishka82/Documents/GeekBrains/JAVA_projects/" +
//                    "Exceptions/src/main/java/web_02_TypesExseption/names.txt", map);
//        }
//
//        public static void writeData(String FileName, HashMap<String, Integer> map  ){
//            try{
//                File file = new File(FileName);
//                FileWriter writer = new FileWriter(file);
//
//                for (String name: map.keySet()){
//                    int value = map.get(name);
//                    writer.write(name + "=" + value + "\n");
//                }
//                writer.close();
//            }
//            catch (IOException e){
//                System.out.println("Ошибка записи!");
//            }
//        }
//
//        public static HashMap<String, Integer> readData (String FileName) {
//            HashMap<String, Integer> map = new HashMap<>();
//            try {
//                File file = new File(FileName);
//                //создаем объект FileReader для объекта File
//                FileReader fr = new FileReader(file);
//                //создаем BufferedReader с существующего FileReader для построчного считывания
//                BufferedReader reader = new BufferedReader(fr);
//                // считаем сначала первую строку
//                String line = "";
//
//                while (line != null) {
//                    // считываем остальные строки в цикле
//                    line = reader.readLine();
//                    if (line != null) {
//                        String[] parts = line.split("=");
//                        int value = 0;
//                        if (parts[1].equals("?")) {
//                            value = parts[0].length();
//                        } else {
//                            try {
//                                value = Integer.parseInt(parts[1]);
//                            } catch (NumberFormatException e) {
//                                throw new IllegalArgumentException("Неверный формат числа!" + line, e);
//                            }
//                        }
//                        map.put(parts[0], value);
//                    }
//                }
//
//                fr.close();
//            } catch (IOException e) {
//                System.out.println("File not found");;
//            }
//            return map;
//        }
//    }
//}
