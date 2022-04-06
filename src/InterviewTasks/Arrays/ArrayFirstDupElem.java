package InterviewTasks.Arrays;

public class ArrayFirstDupElem {

    //write a program that can find the first duplicated element from the array

    public static int firstDup(int [] arr) {

        for(int i=0;i<arr.length; i++) {

            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }

        }
        return arr[0];
    }

    public static void main(String[] args) {
        System.out.println(firstDup(new int [] {5,4,5,1}));
    }

}
