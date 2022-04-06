package InterviewTasks.Collections;

import java.util.HashMap;
import java.util.Map;

public class CountLettersMap {

    //write a method that counts the number of appearances of each char and return map

    public static Map<Character, Integer> countLetters(String str) {

        Map<Character,Integer> result = new HashMap<>();

        for(int i=0;i<str.length();i++) {

                if(result.containsKey(str.charAt(i))){
                    result.put(str.charAt(i), result.get(str.charAt(i)) +1);
                } else{
                    result.put(str.charAt(i), 1);
                }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countLetters("hello"));
    }

}
