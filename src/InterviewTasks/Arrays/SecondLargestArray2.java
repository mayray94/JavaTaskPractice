package InterviewTasks.Arrays;

public class SecondLargestArray2 {

    //write a method to find the 2nd largest number in an array

    public static int secondLargest(int [] arr) {
        int largest = 0;
        int secondLarg = 0;

        for(int i = 0; i<arr.length; i++) {
           if(arr[i] > largest) {
               secondLarg = largest;
               largest = arr[i];
           }
        }
        return secondLarg;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int [] {5,3,4,2,1,6}));
    }



}
