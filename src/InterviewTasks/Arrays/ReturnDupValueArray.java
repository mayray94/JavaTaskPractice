package InterviewTasks.Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReturnDupValueArray {

    //Given an array of integers, write a method to find and return the duplicate value in the array

    public static int dupValue(int[]arr) {

        int dup = 0;

        for(int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]){
                    dup=arr[i];
                }
            }
        }
        return dup;
    }
    //with Maps
    public static int dupsVal(int [] arr) {

        Map<Integer,Integer> result = new HashMap<>();
        int dup = 0;
        for(int i=0; i<arr.length;i++){
            if(result.containsKey(arr[i])){
                result.put(arr[i], result.get(arr[i]) + 1);
            } else{
                result.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> each : result.entrySet()) {
            if(each.getValue()==2){
                dup = each.getKey();
            }
        }
        return dup;
    }

    public static void main(String[] args) {
        System.out.println(dupValue(new int [] {1,2,3,3,4}));
        System.out.println(dupsVal(new int [] {1,2,3,3,4}));
    }

}
