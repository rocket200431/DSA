public class trappedrainwater{
public static void trappedwater(int height[]){
    //left max height
    int n= height.length;
    int leftmaxheight[]=new int[n];
    leftmaxheight[0]=height[0];
    for(int i=1;i<n;i++){
        if(leftmaxheight[i-1]<height[i]){
leftmaxheight[i]=height[i];
        }else{
            leftmaxheight[i]=leftmaxheight[i-1];
        }}
    //right max height
    int rightmaxheight[]=new int[n];
    rightmaxheight[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
        if(rightmaxheight[i+1]<height[i]){
         rightmaxheight[i]=height[i];
        }else{
            rightmaxheight[i]=rightmaxheight[i+1];
        }

    }
    
    //loop
     int trappedwaterlevel=0;
    for(int i=0;i<n;i++){
       trappedwaterlevel+=Math.min(leftmaxheight[i],rightmaxheight[i])-height[i];

    }
    //trapped water=waterlevel-height[i];
    //print totoal trapped water 

    System.out.print("trappedwater"+trappedwaterlevel);
}
    public static void main( String arg[]){
        int height[]={4 ,2 ,0 ,6 ,3 ,2 ,5 };
        trappedwater(height);

    }
}