package DividenConcqer;

public class PraticeSheetq2 {

    public static int countInRange(int []nums,int num,int lo,int hi){
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==num){
            count++;
        }
       }

       return count;
    }

    public static int marjorityElementRec(int nums[],int lo,int hi){
        if(lo==hi){
            return nums[lo];
        }
      
        int mid=lo+(hi-lo)/2;
        int left=marjorityElementRec(nums, lo, mid);
        int right=marjorityElementRec(nums, mid+1, hi);
        
        if(left==right){
            return left;
        }

        int leftCount=countInRange(nums, left, lo,hi);
        int rightCount=countInRange(nums, right, lo, hi);
        return leftCount>rightCount?left:right;


    }



    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(marjorityElementRec(nums, 0, nums.length-1));
    }

    


    
}
