package Arraylist;
import java.util.*;
public class PairsumInrotatedArr {
    public static void pairSum2(ArrayList<Integer>list,int key){
         int i=0;
        
        while((list.get(i)<list.get(i+1))&&(i<list.size())){
            i++;
        }
        int lp=i+1,rp=i;
        while(lp!=rp){

            if(list.get(lp)+list.get(rp)==key){
                 System.out.println(list.get(rp)+"+"+list.get(lp)+"="+key);
                 return;
            }else if(list.get(lp)+list.get(rp)>key){
                rp=(list.size()+rp-1)%list.size();
            }else{
                lp=(lp+1)%list.size();
            }
        }
    }
    public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(7);
    list.add(6);
    list.add(1);
    list.add(2);
    list.add(3);
    pairSum2(list, 9);
}
}
