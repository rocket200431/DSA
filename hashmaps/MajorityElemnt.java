package hashmaps;
import java.util.*;

public class MajorityElemnt {
    public static int majorityelemnt(int nums[]){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            // if(hm.containsKey(nums[i])){
            //     hm.put(nums[i],hm.get(nums[i])+1);

            // }else{
            //     hm.put(nums[i],1);
        
            // }

            hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
        }



        Set<Integer>keys=hm.keySet();
        for (Integer k : keys) {
            if(hm.get(k)>=(nums.length/2)){
                return k;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {

        int nums[]={1,3,2,5,1,3,1,5,1};
       System.out.println( majorityelemnt(nums));
        
    }
    
}
