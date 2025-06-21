





public class Intersectionof2ll {






    public    static class  ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }

        
    }


    public  static ListNode findstartingpointofcycle(ListNode headA){
        ListNode slow=headA;
        ListNode fast=headA;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
            
        }
        if(slow!=fast)return null;

      slow=headA;
      while(slow!=fast){
        slow=slow.next;
        fast=fast.next;
      }

      return slow;
      
    
    }

    
    public  static ListNode getIntersecPoint( ListNode headA,ListNode headB){


        if(headA==null||headB==null){
            return null;
        }

        ListNode temp=headA;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=headB;

        ListNode ans=findstartingpointofcycle( headA);

        temp.next=null;
      return ans;


    }



    public static void main(String[] args) {


            
    ListNode curr=new ListNode(32);
    ListNode headA=curr;
    curr.next=new ListNode(65);
    curr.next.next=new ListNode(57);
    curr.next.next.next=new ListNode(78);
    curr.next.next.next.next=new ListNode(90);
    ListNode curr1=new ListNode(32);
    ListNode headB=curr1;
    curr1.next=new ListNode(63);
    curr1.next.next=new ListNode(56);
    curr1.next.next.next=curr.next.next.next;
    curr1.next.next.next.next=curr.next.next.next.next;

   ListNode ans=getIntersecPoint(headA,headB);
System.out.println(ans.data);

//ans =78
        
    }
    
}
