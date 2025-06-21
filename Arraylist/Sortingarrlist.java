package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sortingarrlist {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(10);
        list.add(7);
        list.add(8);
        Collections.sort(list);
        System.out.println(list);
       //descending order
        Collections.sort(list,Collections.reverseOrder());//collections.reverseorder is a comparator
        //comparator is a function in which it has another sorting code which we want to
        System.out.println(list);

    }
    
}
