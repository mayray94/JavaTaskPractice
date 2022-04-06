package InterviewTasks.Numbers;

public class FactorialOfNum {

    //write a method to calculate the factorial of a number

    public static int factorial(int num) {
        int result = 1;

        for(int i = 2; i<=num; i++){
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }

}
