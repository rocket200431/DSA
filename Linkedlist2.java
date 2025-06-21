import java.util.LinkedList;

public class Linkedlist2 {

    

    


    public static void main(String[] args) {

        LinkedList<Integer>ll=new LinkedList<>();
        //add
   ll.addLast(3);
   ll.addLast(6);
   ll.addFirst(40);
   ll.addFirst(60);

    
        //print
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

        
    }
    
}
