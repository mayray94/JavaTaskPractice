package InterviewTasks.Numbers;

public class ReverseNum2 {

    //write a program to reverse a number

    public static int reversed(int num) {

        int reversed = 0;
        int digit = 0;
        while (num != 0) {
            digit = num%10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reversed(123));
    }

}
