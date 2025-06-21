public class LinkedList {

    public static  class Node{

        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head=null;
    public static Node tail=null;
   public static void  addFirst( int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
     head=newNode;  //o(1)
   }
   public static void addMiddle(int idx,int data){
    
    Node temp=head;
    int i=0;
    while(i<idx-1){
      temp=temp.next;
      i++;
    }

    Node newNode=new Node(data);

    if(head==null){
       addFirst(data);
       return;
    }
    size++;
    newNode.next=  temp.next;
    temp.next=newNode;
    
   }

   public static void addEnd(int data){
    Node newNode=new Node(data);
    size++;
      if(head==null){
        head=tail=newNode;
        return;
      }
    tail.next=newNode;
    tail=newNode;
   }

   public static void print(){
    
    Node temp= head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println("null");
    
   }
   public static int size;

  
   public static  int removeFirst(){
    if(size==0){
      System.out.println("null");
      return Integer.MIN_VALUE;
    }if(size==1){
      size--;
      int val=head.data;
      head=tail=null;
      return val;

    }
    int val=head.data;
    Node temp=head;

    head=head.next;
    temp.next=null;
    temp=null;
    size--;
    return val;
   }
   public static int removeLast(){
      Node temp=head;
      if(size==0){
        return Integer.MIN_VALUE;
      }else if(size==1){
        size--;
        int val=head.data;
        head=tail=null;
        return val;
      }
      
      while(temp.next!=tail){
        
        temp=temp.next;
      }
      
      int val=tail.data;
      temp.next=null;
      size--;
      tail=temp;
      return val;


   }
   public int helper(int key, Node head){

    if(head==null){
      return -1;
    }
    if(head.data==key)return 0;

    int i= helper(key ,head.next);

    if(i==-1){
      return -1;

    }
       return i+1;
    
    
    

    

   }

   public  int rerSearch(int key){
   return helper(key,head);
   }
   
   public static int  itrSearch(int key){
    //o(n);
    int i=0;
    Node temp=head;
    while(temp!=null){
      if(temp.data==key){
        return i;

      }
      temp=temp.next;
      i++;
    
      
    }

    return -1;
   }
   public  static void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
 head=prev;
    
   }

   public static  void removeNthnodefromend(int n){
    int sz=0;
    Node temp=head;
    while(temp!=null){
      temp=temp.next;
      sz++;
    }
    if(n==sz){
      head=head.next;
      return;
    }

    int i=1;
    int idxTofind=sz-n;
    Node prev=head;
    while(i<idxTofind){
      prev=prev.next;
      i++;

    }
   
    prev.next=prev.next.next;
    return;

   }

   public static Node findMid(Node head){
    Node slow=head;
    Node fast=head.next;
    while(fast!=null&&fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
    }
    return slow;
   }

   public static boolean checkPalindrome(){
    //if the size is 0 or 1 that is a palindrome
    if(head==null||head.next==null){
      return true;
    }
    //find mid;

  Node curr=findMid(head);
  Node prev=null;

    //reverse the right part
    while(curr!=null){
      Node next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
      
    }
    //check if left part is equal to right part

    Node left=head;
    Node right=prev;
    while(right!=null){
      if(right.data!=left.data){
        return false;
      }
      right=right.next;
      left=left.next;

    }
    return true;


   }

   public static boolean isCycle(){

    Node slow=head;
    Node fast=head;
    while(fast!=null&&fast.next!=null){
      
      fast=fast.next.next;
      slow=slow.next;
      if(fast==slow){
        return true;
      }

    }
    return false;

   }
   public static void removeCycle(){
    //find cycle
    Node slow=head;
    Node fast=head;
    while(fast!=null&fast.next!=null){
      slow=slow.next;
      fast=fast.next.next;
      if(slow==fast){
        break;
      }
    }

    slow=head;
    Node prev=null;
    while(slow!=fast){
      slow=slow.next;
      prev=fast;
      fast=fast.next;

    }
    prev.next=null;

    

    //move slow to head 
    //slow+1
    //fast+1
    //when slow =fast at that point prev of fast=null
   }
   

   public static Node merge(Node head1,Node head2){
    Node mergedLL=new Node(-1);
    Node temp=mergedLL;
    
    while(head1!=null&&head2!=null){
    if(head1.data<=head2.data){
      temp.next=head1;
      head1=head1.next;
      temp=temp.next;

    }else{
      temp.next=head2;
      head2=head2.next;
      temp=temp.next;

    }}

    while(head1!=null){
      temp.next=head1;
      head1=head1.next;
      temp=temp.next;
    }
    while(head2!=null){
      temp.next=head2;
      head2=head2.next;
      temp=temp.next;

    }

    return mergedLL.next;
    



   }
   public static  Node mergeSort(Node head){
    if(head==null||head.next==null){
      return head;
    }

    //findmid
    Node mid=findMid(head);

    //divide
    Node rightHead=mid.next;
    mid.next=null;
    Node newLeft=mergeSort(head);
    Node newRight=mergeSort(rightHead);

    return merge(newLeft,newRight);


   }


   
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
     // Node temp=new Node(7);
      //  //ll.head=new Node(87);
      // ll. head.next=temp;
      // ll.head.next.next=new Node(9);
       //ll.head.next.next.next=temp;
     //  System.out.println(ll.isCycle());
      // ll.removeCycle();
       //System.out.println(ll.isCycle());
      
      // we dont give value like above in the main function and  we create methods to add and remove and serach and print

            //  ll.addFirst(1);
            //  print();
            //  ll.addFirst(2);
            //  print();
            //  ll.addFirst(1);
            //  print();
             //ll.addEnd(1);
            // print();
             //ll.addMiddle(2, 9);
            // print();
            // System.err.println("the size of the linked list : "+ll.size);
  
           // ll.removeFirst();
           // print();
           // ll.removeLast();
            //print();
           // System.err.println("the size of the linked list : "+ll.size);
           
           
            //System.out.println("the key is found at the index"+ll.rerSearch(9));
            // ll.reverse();
            // ll.print();

            // ll.removeNthnodefromend(3);
            // ll.print();;
          
          ll.addEnd(3);
          ll.addEnd(7);
          ll.addEnd(1);
          ll.addEnd(67);
         

       ll.head= ll.mergeSort(ll.head);//o(nlogn);
      ll.print();


    }
    
}
