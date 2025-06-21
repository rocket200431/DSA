package hashmaps;
import java.util.*;
public class ValidAnagrams {
   /*  public static boolean isValidAnagram(String str1, String str2){
        HashMap<Character,Integer>hm1=new HashMap<>();
         HashMap<Character,Integer>hm2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            hm1.put(str1.charAt(i),hm1.getOrDefault(str1.charAt(i), 0)+1);
            hm2.put(str2.charAt(i),hm2.getOrDefault(str2.charAt(i), 0)+1);

        } 
        for(int i=0;i<str1.length();i++){
            if(hm1.get(str1.charAt(i))!=hm2.get(str2.charAt(i))){
                return false;
            }
        }
            return true;
    }*/
    public static boolean isValidAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(int i=0;i<str1.length();i++){
            hm.put(str1.charAt(i),hm.getOrDefault(str1.charAt(i), 0)+1);
            
        } 
        for(int i=0;i<str2.length();i++){
            if(hm.get(str2.charAt(i))!=null){
               if(hm.get(str2.charAt(i))==1){
                hm.remove(str2.charAt(i));
               }else{
                hm.put(str2.charAt(i), hm.get(str2.charAt(i))-1);
               }
            }else{
                 return false;
            }

        }
         return hm.isEmpty();
    }   


    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        System.out.println(isValidAnagram(str1, str2));
    }

    
}
