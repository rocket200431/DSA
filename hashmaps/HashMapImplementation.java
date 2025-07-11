package hashmaps;
import java.util.*;
public class HashMapImplementation {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }

        }
            private int n;//size-- totoal no of nodes thta exits in hashmaps
            private int N;
            private LinkedList<Node>buckets[];//N

            @SuppressWarnings("unchecked")
            public HashMap(){
                this.N=4;
                this.buckets=new LinkedList[4];
                for(int i=0;i<4;i++){
                    this.buckets[i]=new LinkedList<>();
                }
            }

                 private int hashFunction(K key){
                    int hc=key.hashCode();// returns an integer value it might be +ve or -ve
                    // i need only postive num and the number should be in btw bucket size
                      return Math.abs(hc)%N;
                 }
                 private int SearchInLL(K key,int bi ){
                    LinkedList<Node>ll=buckets[bi];
                    int di=0;
                    for(int i=0;i<ll.size();i++){
                        Node node=ll.get(i);
                        
                        if(node.key==key){
                            return di;
            
                        }
                        di++;
                    }
                   return -1;

                 }
                 @SuppressWarnings("unchecked")
                 private void rehash(){
                    LinkedList<Node>oldBucket[]=buckets;
                    buckets=new LinkedList[N*2];
                    N=N*2;
                    for(int i=0;i<buckets.length;i++){
                        buckets[i]=new LinkedList<>();

                    }
                    for(int i=0;i<oldBucket.length;i++){
                       LinkedList<Node>ll=oldBucket[i];
                       for(int j=0;j<ll.size();j++){
                        Node node=ll.remove();
                        put(node.key,node.value);
                       }
                    }

                 }
                public void put(K key,V value){ 
                    int bi=hashFunction(key);// returns the bucket index
                    int di=SearchInLL(key,bi); // search data in ll and returns its index or if the dta isnt there then it returns -1
                    if(di!=-1){
                        Node node=buckets[bi].get(di);
                        node.value =value;
                    }else{
                        buckets[bi].add(new Node (key,value));
                        n++;
                    }
                    double  lambda=n/N;
                    if(lambda>2.0){
                        rehash();
                    }




                }
                public boolean containsKey(K key){
                     int bi=hashFunction(key);// returns the bucket index
                    int di=SearchInLL(key,bi); // search data in ll and returns its index or if the dta isnt there then it returns -1
                    if(di!=-1){
                        return true;
                    }else{
                        return false;
                    }

                    
                       
                   
                }
                public V remove(K key){
                     int bi=hashFunction(key);// returns the bucket index
                    int di=SearchInLL(key,bi); // search data in ll and returns its index or if the dta isnt there then it returns -1
                    if(di!=-1){
                        n--;
                        Node node=buckets[bi].remove(di);
                        return  node.value ;
                    }else{
                       return null;
                    }
                    
                }
                public V get(K key){
                     int bi=hashFunction(key);// returns the bucket index
                    int di=SearchInLL(key,bi); // search data in ll and returns its index or if the dta isnt there then it returns -1
                    if(di!=-1){
                        Node node=buckets[bi].get(di);
                       return node.value;
                    }else{
                       return null;
                    }

                    
            }

            public ArrayList<K>keySet(){
                ArrayList<K>keys=new ArrayList<>();
                for(int i=0;i<buckets.length;i++){
                    LinkedList<Node>ll=buckets[i];
                    for (Node node: ll) {
                        keys.add(node.key);
                        
                    }
                }
                return keys;

            }
            public boolean isEmpty(){
                return n==0;
            }

                
            

        
    }

    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
      hm.put("Nepal",5);

      ArrayList<String>keys=hm.keySet();
      for (String string : keys) {
        System.out.println(string);
        
      }
      System.out.println(hm.get("India"));
    }

    
    
}
