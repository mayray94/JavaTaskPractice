package InterviewTasks.Numbers;

public class NumberPalindrome {

    //Write a method to find out of a number is Palindrome
    //545 -> true  13-> false

    public static boolean isPalindrome(int num) {

        int temp = 0;
        int copy = num;
        int remainder = 0;

        while (num > 0) {

            remainder = num % 10;
            temp = temp * 10 + remainder;
            num = num / 10;

        }
        if(temp==copy){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(545));
    }

}
