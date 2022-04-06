package InterviewTasks.Arrays;

public class ArrayMax {

    //Write a function that can find the maximum number from an int Array

    public static int maxArr(int [] arr) {
        int max = Integer.MIN_VALUE;

        for(int each : arr) {
            if (each> max) {
                max = each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArr(new int[] {3,4,78,4,5}));
    }

}
