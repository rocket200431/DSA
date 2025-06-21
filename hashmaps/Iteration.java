package hashmaps;

import java.util.*;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",150);
        hm.put("uk",90);
        hm.put("us",130);

    Set<String>K=hm.keySet();
    for (String k : K) {

    System.out.println("Key ="+k+",Value="+hm.get(k));
        
    }
    }
}
