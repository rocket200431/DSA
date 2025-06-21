

public class UsingLL {
    public static  class Node{
        int data;
         Node next;
         public Node(int data){
            this.data=data;
            this.next=null;

         }

    }

    public static  class Stack{
       public Node head=null;
       public boolean isEmpty(){
        return head==null;
       }
       public void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
       }

       public int pop(){
        if(isEmpty()){
            return -1;

        }
        int top=head.data;
        head=head.next;
        return top;
       }

       public int peek(){
        return head.data;
       }


    }
    public static void main(String[] args) {

        Stack s=new Stack();
        s.push(6);
        s.push(5);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
        System.out.println(s.pop());}
       
        
    }
    
}
