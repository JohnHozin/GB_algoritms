package exceptions.lesson_1;


import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 3, 2, 4, 0};
        List<Integer> nullIndexes = checkArray(arr);
        if (nullIndexes.size() > 0) {
            System.out.println("Массив содержит null в ячейках" + nullIndexes);
        } else {
            System.out.println("Массив не содержит null");
        }
    }

    public static List<Integer> checkArray(Integer[] arr) {
        List<Integer> nullIndexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullIndexes.add(i);
            }
        }
        return nullIndexes;
    }

}

