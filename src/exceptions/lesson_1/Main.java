package exceptions.lesson_1;

public class Main {
    final static int length = 5;

    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println(method_1(arr));
    }

    private static int method_1(int[] arr) {
        if (arr.length >= length) {
            return arr.length;
        } else {
            return -1;
        }
    }
}
