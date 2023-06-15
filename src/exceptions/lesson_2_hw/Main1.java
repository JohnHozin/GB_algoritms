package exceptions.lesson_2_hw;

public class Main1 {
    public static void main(String[] args) {
        int [] intArray = new int[]{1,2,3,4,5,6,7,8,9,10}; // не было объявления массива, задания его длины и значений
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d; // деление на 0
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
