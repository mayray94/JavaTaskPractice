package InterviewTasks.Arrays;

import java.util.Arrays;

public class SortArray {

    //write a method with will sort an array without the sort method

    public static int [] sortArr(int[] arr) {

        for(int i = 0; i<arr.length; i++) {

            for(int j = i + 1; j< arr.length; j++) {

                int temp = 0;
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {2,5,3,7,4,8,1};
        System.out.println(Arrays.toString(sortArr(arr)));
    }

}
