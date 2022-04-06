package InterviewTasks.Strings;

public class BalancedString {

    //write a method that will check if a string is balanced or not

    public static boolean balanced(String str) {
        int i = 0;
        int j = str.length()-1;

        while (i<j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(balanced("pole"));
    }

}
