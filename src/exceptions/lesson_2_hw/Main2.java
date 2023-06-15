package exceptions.lesson_2_hw;

import java.io.FileNotFoundException;

public class Main2 {
//    public static void main(String[] args) throws Exception {
    public static void main(String[] args){ // убираем проброс ошибок
        try {
            int a = 90;
            int b = 0;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) { // поднимаем ловлю ошибок выше
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) { // поднимаем ловлю ошибок выше
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя!"); // добавляем ещё одну обработку ошибки
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    // метод который не работает с файлами не может дать такую ошибку
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
