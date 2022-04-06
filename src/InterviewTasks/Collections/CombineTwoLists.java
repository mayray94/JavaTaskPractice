package InterviewTasks.Collections;

import java.util.ArrayList;
import java.util.List;

public class CombineTwoLists {

    //write a method that will combine two lists

    public static List<Integer> combine(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);

        System.out.println(combine(list1,list2));
    }

}
