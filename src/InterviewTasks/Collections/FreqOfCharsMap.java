package InterviewTasks.Collections;

import java.util.HashMap;
import java.util.Map;

public class FreqOfCharsMap {

    //Write a method that prints the frequency of each character from a String

    public static Map<Character, Integer> freq(String str) {

        Map<Character,Integer> result = new HashMap<>();

        for(int i=0;i<str.length();i++) {
            int count =0;
            for(int j=i+1;j<str.length();j++) {
                count++;
                }
            if (!result.containsKey(str.charAt(i))){
                result.put(str.charAt(i),count);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(freq("aaabbcdd"));
    }

}
