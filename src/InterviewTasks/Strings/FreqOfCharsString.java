package InterviewTasks.Strings;

public class FreqOfCharsString {

    //write a return method that can find the frequency of characters
    // ex: aaabbcdd -> a3b2c1d2

    public static String freqChars(String str) {

        String noDups = "";
        for(int i=0;i<str.length();i++) {
            if(!noDups.contains(""+str.charAt(i))) {
                noDups += str.charAt(i);
            }
        }
        String result = "";
        for (int i = 0; i<noDups.length();i++){
            int count = 0;
            for (int j = 0; j<str.length();j++) {
                if(noDups.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            result += noDups.charAt(i) +""+ count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(freqChars("aaabbcdd"));
    }

}
