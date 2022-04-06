package InterviewTasks.Strings;

public class StringPalindrome {

    //check if a string is palindrome anna -> true   apple -> false

    public static boolean palindrome(String str) {

        int j = str.length() - 1;
        int i = 0;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("anna"));
        System.out.println(palindrome("apple"));
    }


}

