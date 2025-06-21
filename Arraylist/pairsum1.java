package Arraylist;


import java.util.*;

public class pairsum1{
    public static boolean pairSum(ArrayList<Integer>list,int key){
        int rp=list.size()-1;
        int lp=0;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==key){
                System.out.println(list.get(rp)+"+"+list.get(lp)+"="+key);
                return true;
            }else if(list.get(rp)+list.get(lp)>key){
                rp--;
            }else{
                lp++;
            }

        }

        return false;
    }
public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    pairSum(list, 5);
}

}
