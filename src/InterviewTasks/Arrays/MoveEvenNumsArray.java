package InterviewTasks.Arrays;

import java.util.Arrays;

public class MoveEvenNumsArray {

    //Given an array, move all even numbers to the left side

    public static int [] evenLeft(int [] arr) {

        int temp = 0;

        for(int i=0; i<arr.length;i++) {

            for(int j=0;j<arr.length;j++) {

                if(arr[i] % 2 ==0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
    return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenLeft(new int [] {2,4,5,7,6,8,1})));
    }

}
