package InterviewTasks.Numbers;

public class SwapTwoNums {

    //Write a program to swap two numbers without using a temp variable

    public static void swapNums(int a, int b) {

       a = a + b; //5
       b = a - b; //5-3=2
       a = a-b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        swapNums(2,3);
    }

}
