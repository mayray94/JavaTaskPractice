package InterviewTasks.Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMiddleNum {

    //Find middle element in doubly linked list

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //list.add(5);

        System.out.println(list.get(list.size()/2));


    }

}
