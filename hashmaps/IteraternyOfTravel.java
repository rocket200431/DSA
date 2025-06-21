package hashmaps;
import java.util.*;
public class IteraternyOfTravel {
    public static String startingPoint(HashMap<String,String>hm){
        HashMap<String,String>rhm=new HashMap<>();
        for (String key   : hm.keySet()) {
            rhm.put(hm.get(key),key);
    
            
        }

        for (String key :hm.keySet()) {
            if(!rhm.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String ,String>hm=new HashMap<>();
        hm.put("chennai","benguluru");
        hm.put("mumbai","delhi");
        hm.put("goa","chennai");
        hm.put("delhi","goa");
        String start=startingPoint(hm);
        System.out.print(start);
        for (String key : hm.keySet()) {
            System.out.print("->"+hm.get(start));
            start=hm.get(start);
            
        }


    }
    
}
