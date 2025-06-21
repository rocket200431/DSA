package Arraylist;

import java.util.*;
public class Praticeques {

    // ques 1
    public static boolean monotonic(ArrayList<Integer>list,int idx,int count1,int count2){

        if((idx==list.size()-1)){
if(count1==list.size()-1||count2==list.size()-1){
            return true;}else{
                 return false;
            }
        }
        if((list.get(idx)<=list.get(idx+1))){
            if(count2>0)return false;
           if(monotonic(list, idx+1, count1+1,count2)){
            
            return true;
           };
        }else if(list.get(idx)>=list.get(idx+1)){
            if(count2>0)return false;

            if( monotonic(list, idx+1, count1, count2+1)){
                return true;
            }
        }

         return false;
        
    }
    // ques2

public static ArrayList<Integer> lonelyNum(ArrayList<Integer> list) {
   HashSet<Integer>hs=new HashSet<>(list);
   LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
   for(int num:list){
    if(!(hs.contains(num-1)||hs.contains(num+1))){
        lhs.add(num);
    }
   }

   return new ArrayList<>(lhs);
}



// ques 4
public static void  beautifulArray(int n){
    LinkedHashSet<Integer>lhs=new LinkedHashSet<>();
    lhs.add((int)Math.floor(Math.random()*100+1));
    int i=1;
while(i<n){
    
}
  
}




    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
//     list.add(1);
//     list.add(2);
//     list.add(0);
//     list.add(4);
//     list.add(5);
//   System.out.println(monotonic(list, 0, 0, 0));

// ques 2
list.add(9);
list.add(6);
list.add(5);
list.add(1);
System.out.println(lonelyNum(list));
    }
}
