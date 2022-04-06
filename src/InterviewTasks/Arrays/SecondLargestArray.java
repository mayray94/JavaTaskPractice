package InterviewTasks.Arrays;

public class SecondLargestArray {

    //Write a method to find the second largest in an array

    public static int secondLargest(int[] arr) {

        int max = 0;
        int second = 0;
        for(int i = 0; i<arr.length; i++){

            if(arr[i] > max){
                second = max;
                max = arr[i];
            }
        }
        return second;

    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[] {2,5,3,4,6}));
    }


}
