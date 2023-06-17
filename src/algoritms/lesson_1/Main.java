package algoritms.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        task_1(100);
//        task_2(100);
//        System.out.println(task_2(100));
        task_3(6);

    }

    static void task_1(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += i;
        }
        System.out.println(result);
    }

    static List<Integer> task_2(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }


    static void task_3(int facets) {
        int count = 0;
        for (int i = 0; i < facets; i++) {
            for (int j = 0; j < facets; j++) {
                for (int k = 0; k < facets; k++) {
                    for (int l = 0; l < facets; l++) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    static void task_3_1(int cubs, int facets) {
        int count = 0;
        for (int i = 0; i < cubs; i++) {


            count++;

        }
        System.out.println(count);
    }

    public static int combinationCount(int count, int faces) {
        if (count > 0) {
            return recursiveCounter(1, count, faces);
        } else {
            return 0;
        }
    }

    private static int recursiveCounter(int depth, int maxDepth, int faces) {
        int count = 0;
        for (int i = 1; i <= faces; i++) {
            if (depth == maxDepth) {
                count++;
            } else {
                count += recursiveCounter(depth + 1, maxDepth, faces);
            }
        }
        return count;
    }
}

