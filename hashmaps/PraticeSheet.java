package hashmaps;
import java.util.*;
public class PraticeSheet {
    public static void ques1bruteforce(int nums[],int target,ArrayList<Integer>List,int sum,int j){
       if(sum==target){
        System.out.println(List);
        return ;
       }
       if(sum>target){
        List.remove(nums[j]);
        return ;
       }
        
        for(int i=0;i<nums.length;i++){
             
             sum=nums[i];
             List.add(nums[i]);
  
           if(sum+nums[j]<target){
            ques1bruteforce(nums, target,  List.add(i),sum+nums[i],j+1);

            }
  
        }
       
       
    }


}
