package InterviewTasks.Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEndArray {

    //Given an array, write a program to move all zeros to the end

    public static int [] zerosEnd(int[]arr) {

        int [] removed = new int[arr.length];
        int count =0;
        for(int each : arr) {
            if(each != 0) {
                removed[count++] = each;
            }
        }
        return removed;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zerosEnd(new int[]{1,0,9,0,0,8,7,6,5})));
    }

}
