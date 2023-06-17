package exceptions.lesson_2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"5","6"},{"1","2"},{"1","a"}};
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = 0;
                try {
                     val = Integer.parseInt(arr[i][j]);
                } catch (Exception e){

                }
                sum += val;
            }
        }
        return sum;
    }
}
