package hashmaps;

import java.util.HashMap;

public class Operations {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        

        //Insert-O(1)
        hm.put("India",100);
        hm.put("UK",150);
        hm.put("US",50);
        System.out.println(hm);// the printed data will be in unordered as hashmaps in java doesnt follow any order in placing data

        //get-o(1)
        int population=hm.get("India");
        System.out.println(population);
        
        System.out.println(hm.get("london"));// returns null

        //Containskey-o(1);
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("indonesia"));
      // remove-o(1)
       
      System.out.println(hm.remove("India"));// returns its value and remove from data;
      System.err.println(hm);
      System.out.println(hm.remove("hawai"));// as this key is not there it returns null value

      // Size-o(1)

      System.out.println(hm.size());

      // isEmpty()-o(1) -returns true if it hash map is empty

      System.out.println(hm.isEmpty());

      
      // clear-o(1)-removes all the data in the hashmap
            hm.clear();
      System.out.println(hm.isEmpty());
      


    }



    
}
