package InterviewTasks.Arrays;

public class SecondLargest2DArray {

    //In a 2D array, find the 2nd largest number

    public static int secondLargest(int [][] arr) {

        int second = 0;
        int max = 0;

        for(int i=0; i<arr.length;i++) {

            for (int j = 0; j<arr[i].length;j++) {

                if(arr[i][j] > max) {
                    second = max;
                    max = arr[i][j];
                }
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{6,4,1,23}};
        System.out.println(secondLargest(arr));
    }

}
