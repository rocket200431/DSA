package hashmaps;
import java.util.*;
public class HashSets {
    public static void main(String[] args) {
    //     HashSet<Integer>set=new HashSet<>();
    //     set.add(1);
    //     set.add(2);
    //     set.add(3);
    //     set.add(4);
    //     set.add(3);
    //     System.out.println(set);
    //    set.remove(2);
    //    System.out.println(set.contains(2));
     HashSet<String>cities=new HashSet<>();
     cities.add("chennai");
     cities.add("mumbai");
     cities.add("hyb");
// iterartion on hashset by iterator or advanced forloop(i.e; for)
    //  Iterator it=cities.iterator();
    //  while(it.hasNext()){
    //     System.out.println(it.next());

    //  }
    // }
for (String city: cities) {
    System.out.println(city);
    
}

    
}
}