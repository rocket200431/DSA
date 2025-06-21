package Arraylist;
import java.util.ArrayList;

public class Maximumwater2pt {
   public  static void twoptr(ArrayList<Integer>list){


    int lp=0;
    int rp=list.size()-1;
    int maximum=Integer.MIN_VALUE;
    //calucation

    while(lp<rp){
        int storedwater=Math.min(list.get(lp), list.get(rp))*(rp-lp);
        storedwater=Math.abs(storedwater);
        maximum=Math.max(maximum, storedwater);

        if(list.get(lp)<list.get(rp)){
            lp++;
        }else {
            rp--;
        }
    }


    System.out.println(maximum);
    //update

   }
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
        twoptr(list);
    }
    
}
