package InterviewTasks.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayAddUpToSum {

    /**
     * given an int[] 'arr' and another int 'sum',
     *      Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
     *         Example:
     *             arr = [8, 7, 2, 5, 3, 1]
     *             sum = 10
     *             Output:
     *                {8=2, 7=3}
     */

    public static Map<Integer, Integer> addUp(int [] arr, int sum) {

        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i<arr.length; i++) {

            for(int j = i+1; j<arr.length; j++) {

                if (arr[i] + arr[j] == sum) {
                    result.put(arr[i], arr[j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addUp(new int [] {8,7,2,5,3,1}, 10));
    }

}
