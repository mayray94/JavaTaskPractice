package InterviewTasks.Strings;

public class RemoveDupsString {

    //write a method that will remove dups from a string

    public static String removeDups(String str) {

        String noDups = "";
        for (int i=0; i<str.length();i++) {
            if (!noDups.contains(""+ str.charAt(i))) {
                noDups += str.charAt(i);
            }
        }
        return noDups;
    }

    public static void main(String[] args) {
        System.out.println(removeDups("aabbhdnnn"));
    }

}
