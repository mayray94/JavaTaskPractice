package InterviewTasks.Arrays;

public class NumOfOccurrences {

    //count the number of occurrences of the given element in an array

    public static int occurrences(int [] arr, int elem) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == elem) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(occurrences(new int [] {1,1,3,2,4,2,2,5,4,1}, 1));
    }

}
