package InterviewTasks.Numbers;

public class ReverseNum {

    //write a program to reverse a number

    public static int reverseNum(int num) {

        int temp = 0;

        while(num !=0) {
            temp = (temp*10) + (num %10);
            num=num/10;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(234));
    }

}
