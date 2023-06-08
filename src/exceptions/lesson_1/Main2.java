package exceptions.lesson_1;

public class Main2 {
    final static int length = 3;

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.println(method_3(arr,5));
    }

    private static int method_3(int[] arr, int number) {
        if (arr == null){
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
}
