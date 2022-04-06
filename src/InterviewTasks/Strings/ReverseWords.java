package InterviewTasks.Strings;

public class ReverseWords {

    //write a method that will reverse words

    public static String reversedWords(String str) {
        String reverse = "";
        for (int i=str.length()-1;i>=0;i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reversedWords("today is thursday"));
    }

}
