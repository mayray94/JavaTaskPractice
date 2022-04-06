package InterviewTasks.Strings;

public class RemoveDupsFromString {

    //remove dups from string

    public static String removeDups(String str) {

        String noDups = "";

        for(int i=0; i<str.length();i++) {
            if(!noDups.contains(""+str.charAt(i))){
                noDups += str.charAt(i);
            }
        }

        //OR

//        for(String each:str.split("")){
//            if (!noDups.contains(each)){
//                noDups+=each;
//            }
//        }

        return noDups;
    }

    public static void main(String[] args) {
        System.out.println(removeDups("aabbbbc"));
    }

}
