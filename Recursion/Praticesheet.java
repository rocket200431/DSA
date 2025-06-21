package Recursion;

public class Praticesheet {
    public static void  ques1(int arr[],int index ,int key){
      if(index==arr.length){
        return;
      }
        if(arr[index]==key){
            System.out.println(index);
        }
        ques1(arr, index+1, key);
     

    }

    public static String ques2(String arr[],int n){
        if(n<1){
            
            return " ";
        }  
        
         String str=ques2(arr, n/10);
       
        str+=arr[n%10]+" ";
        return str;

    
    
    }

// another model ques 2
    public static void printwordsofnum(int n,String str,String arr[]){
     if(n<1){
        System.out.println(str.trim());
        return;
     }
     str=arr[n%10]+str;
     printwordsofnum(n/10, str, arr);
    }

    public static  int ques3(String str){
        if(str.length()==0){
            return 0;
        }

     return ques3(str.substring(1))+1;

    }

    public static void ques4(String str,int si,int ei,int count){
      if(si==str.length()){
        System.out.println(count);
       return;

      }
       if(ei>str.length()){
       ques4(str, si+1, si+2, count);
        
      }else {
       
      
        String temp=str.substring(si,ei);
        if(temp.charAt(0)==temp.charAt( temp.length()-1)){
            count++;
            System.out.println(temp);
        }
        ques4(str, si, ei+1,count);}
        
        
    }
    public static void ques5(int n,char from,char helper,char to){
        if(n==1){
            System.out.println("Move 1 from "+from+" to "+to);
            return;
        }

        ques5(n-1, from, to, helper);

        System.out.println("Move "+n +" from "+from+" to "+to);

        ques5(n-1, helper, from, to);





    }

    

    public static void main(String[] args) {
        // int arr[]={2,3,4,2,5,2};
        // ques1(arr, 0, 2);
 //String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};


//  String str=ques2(arr, 123);
//  System.out.println(str.trim());
//printwordsofnum(132, "", arr);
//System.out.println(ques3("mallika"));
//ques4("abcda", 0, 1, 0);
ques5(3, 'a', 'b', 'c');


    }
    
}
