package exceptions.lesson_1;


public class Main1 {
    final static int length = 3;

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
//        System.out.println(method_2(arr,5));
        print(method_2(arr, 5));
    }

    private static int method_2(int[] arr, int number) {
        if (arr == null) {
            return -3;
        }
        if (arr.length >= length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == number) {
                    return i;
                }
            }
            return -2;
        } else {
            return -1;
        }
    }

    private static void print(int result) {
        switch (result) {
            case -1:
                System.out.println("Ошибка: длина массива меньше заданного минимума");
                break;
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            case -3:
                System.out.println("Массив не задан");
                break;
            case -4:
                System.out.println("Длина массива равна 0");
                break;
            default:
                System.out.println("Индекс найденного элемента: " + result);
        }
    }
}
