package hashmaps;
import java.util.*;
public class LinkedHm {

    public static void main(String[] args) {
            LinkedHashMap<String,Integer>lhm=  new LinkedHashMap<>(); 
            lhm.put("India",100);
            lhm.put("China",150);
            lhm.put("us",50);
            System.out.println(lhm);// printed in order
             HashMap<String,Integer>hm=  new HashMap<>(); 
            hm.put("India",100);
            hm.put("China",150);
            hm.put("us",50);
            System.out.println(hm);       
    }
    
}
