package exceptions.lesson_1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива.
//        При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

public class Main3 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 0}, {0, 1}};
        System.out.println(method4(arr));
    }

    private static int method4(int[][] arr) {
        int result = 0;
        for (int[] value : arr) {
            if (arr.length != value.length) {
                throw new RuntimeException("Массив не квадратный");
            }
        }

        for (int[] row : arr) {
            for (int element : row) {
                if (element != 0 && element != 1) {
                    throw new RuntimeException("Неправильные значения");
                }
                result += element;
            }
        }
        return result;
    }
}
