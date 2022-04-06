package InterviewTasks.Arrays;

import java.util.Arrays;

public class ReverseArray {

    //write a method that will reverse an array

    public static int [] reverseArr(int [] arr) {
        int [] reversed = new int[arr.length];
        int count = 0;
        for(int i= arr.length-1; i>=0; i--) {
            reversed[count++] = arr[i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(reverseArr(arr)));

    }

}
