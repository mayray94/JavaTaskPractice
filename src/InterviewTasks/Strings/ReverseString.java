package InterviewTasks.Strings;

public class ReverseString {

    //write a method that will reverse a string

    public static String reverse(String str) {
        String reversed = "";

        for (int i=str.length()-1; i>=0;i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void reversed(String str) {

        StringBuilder reverse = new StringBuilder(str);
        System.out.println(reverse.reverse());

    }

    public static void main(String[] args) {
        System.out.println(reverse("mayra"));
        reversed("mayra");
    }

}
