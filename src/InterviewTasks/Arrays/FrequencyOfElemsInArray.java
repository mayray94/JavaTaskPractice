package InterviewTasks.Arrays;

public class FrequencyOfElemsInArray {

    //write a method that will find the frequency of elements in an array

    public static void freqArray(int [] arr) {

        int [] freq = new int[arr.length];
        int visited = -1;

        for (int i=0; i<arr.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    counter++;
                    freq[j] = visited;
                }
            }

            if(freq[i] != visited) {
                freq[i] = counter;
            } }
            System.out.println("---------------------------------------");
            System.out.println(" Element | Frequency");
            System.out.println("---------------------------------------");
            for(int i = 0; i < freq.length; i++){
                if(freq[i] != visited)
                    System.out.println("    " + arr[i] + "    |    " + freq[i]);
            }
            System.out.println("----------------------------------------");
        }


    

    public static void main(String[] args) {
        freqArray(new int [] {2,2,3,1,5,5,4});

    }
}
