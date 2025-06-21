package Arraylist;
import java.util.ArrayList;
public class MaximumwaterBF {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int Maxminum=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
             
                int storedwater=(Math.min(list.get(i),list.get(j)))*(i-j);
                storedwater=Math.abs(storedwater);

                Maxminum=Math.max(Maxminum, storedwater);




            }
            
        }


        System.out.println("the maximum water stored in it is"+Maxminum);
    }
    
}
