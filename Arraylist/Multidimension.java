package Arraylist;
import java.util.ArrayList;
public class Multidimension {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();

    ArrayList<Integer>list=new ArrayList<>();
    ArrayList<Integer>list1=new ArrayList<>();
    ArrayList<Integer>list2=new ArrayList<>();

    for(int i=1;i<6;i++){
        list.add(i);
        list1.add(i*2);
        list2.add(i*3);
    }

    mainlist.add(list);
    
    mainlist.add(list1);
    
    mainlist.add(list2);

    System.out.println(mainlist);

    for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer>Currlist=mainlist.get(i);
        for(int j=0;j<Currlist.size();j++){
            System.out.print(Currlist.get(j)+" ");
        }

        System.out.println();
    }





    }



    
}
