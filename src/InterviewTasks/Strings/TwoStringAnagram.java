package InterviewTasks.Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class TwoStringAnagram {

    //write a method that checks if two strings are anagram

    public static boolean isAnagram(String a, String b) {

            char [] aArr = a.toLowerCase().toCharArray();
            char [] bArr = b.toLowerCase().toCharArray();
            Arrays.sort(aArr);
            Arrays.sort(bArr);

            return Arrays.equals(aArr,bArr);
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("Triangle", "integral"));
        System.out.println(isAnagram("abc", "ccb"));
    }
}
