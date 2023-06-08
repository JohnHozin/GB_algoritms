package exceptions.lesson_1_hw;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ArithmeticException: /by zero
//        System.out.println(exception1(10, 0));
//
//        ArrayIndexOutOfBoundsException:
//        Index 100 out of bounds for length 3
//        System.out.println(exception2(new int[]{1, 2, 3}));
//
//        NullPointerException:
//        Cannot invoke "java.lang.Integer.intValue()" because "b" is null
//        Integer a = 12;
//        Integer b = null;
//        System.out.println(exception3(a, b));

        int[] arrA = new int[]{2, 4, 9, 5, 6, 7};
        int[] arrB = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(difference(arrA, arrB)));
        System.out.println(Arrays.toString(division(arrA, arrB)));

    }

    public static int exception1(int a, int b) {
        return a / b;
    }

    public static int exception2(int[] a) {
        return a[100];
    }

    public static Integer exception3(Integer a, Integer b) {
        return a + b;
    }

    public static int[] difference(int[] arrA, int[] arrB) {
        if (arrA.length == arrB.length) {
            int[] arrC = new int[arrA.length];
            for (int i = 0; i < arrA.length; i++) {
                arrC[i] = arrA[i] - arrB[i];
            }
            return arrC;
        } else {
            throw new RuntimeException("Разные длины массивов");
        }
    }

    public static int[] division(int[] arrA, int[] arrB) {
        if (arrA.length == arrB.length) {
            int[] arrC = new int[arrA.length];
            for (int i = 0; i < arrA.length; i++) {
                if (arrB[i] == 0) {
                    throw new RuntimeException("Делить на ноль нельзя");
                }
                arrC[i] = arrA[i] / arrB[i];
            }
            return arrC;
        } else {
            throw new RuntimeException("Разные длины массивов");
        }
    }
}
