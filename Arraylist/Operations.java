package Arraylist;
import java.util.ArrayList;

public class Operations {



    public static void main(String[] args) {

        // just like vectors in c++
        
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list1=new ArrayList<>();

        ArrayList<Boolean>lsit2=new ArrayList<>();
    // adding element in list 
    //o(1);

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);

        System.out.println(list);

        //get element

        //to get an element at index i we use get 
        //o(1)

       System.out.println( list.get(2));

       //remove an elemnt at index i
       //o(n)
       //list.remove(3);
       //System.out.println(list);
         //set

         list.set(2,10);
         System.out.println(list);
    

    }
    
}

    

