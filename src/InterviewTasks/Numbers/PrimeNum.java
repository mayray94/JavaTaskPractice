package InterviewTasks.Numbers;

public class PrimeNum {

    //write a method that checks if a number is a prime number
    //prime number- divisible by itself and 1 only, and greater than 1

    public static boolean isPrimeNum(int num) {

        if(num > 0) {

            for(int i=2; i<num; i++) {

             if(num % i == 0) {
                 return false;
             }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNum(35));
    }

}
