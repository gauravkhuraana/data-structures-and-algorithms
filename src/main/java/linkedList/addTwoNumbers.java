package linkedList;

import linkedList.singleLinkedList.linkedListStructure;

public class addTwoNumbers {

    /**
     * Definition for singly-linked list.
     * */
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


         ListNode l7Head=null;
         ListNode l7Tail=null;

         int value=0;
         int count=0;
         while(l1!=null || l2!=null) {
             ListNode temp = new ListNode();
             temp.next = null;


             if (l1 != null) {
                 value = l1.val;
                 l1=l1.next;
             }
             if (l2 != null)
             {
                 value=value+l2.val;
                 l2=l2.next;

             }
             value=value+count;

             if(value<10)
             {
                 temp.val=value;
                 count=0;
             }

             else if(value>=10)
             {

                 int rem=value%10;
                 temp.val=rem;
                 count=1;
             }


             // Inserting into Linkedlist logic
             if(l7Head==null)
             {
                 l7Head=temp;
                 l7Tail=temp;

             }
             else if(l7Head==l7Tail)
             {
                 l7Head.next=temp;
                 l7Tail=temp;

             }
             else if(l7Head!=l7Tail)
             {
                 l7Tail.next=temp;
                 l7Tail=temp;

             }
             value=0;

         }

         if(count==1)
         {
             ListNode temp= new ListNode();
             temp.val=1;
             l7Tail.next=temp;
             l7Tail=temp;
         }

//         while(l!=null)
//         {
//             ListNode temp= new ListNode();
//             temp.next=null;
//
//
//             value=l1.val+count;
//
//         }
         return l7Head;
    }


    public static ListNode addTwoNumbers_Optimised(ListNode l1, ListNode l2) {


         //create the first node
        // this will be used to move further
        ListNode node = new ListNode(0);

        // create a node so you can hold the start of linkedlist
        ListNode head = node;


        int sum=0;
        int carry=0;
        int rem = 0;

        while(l1!=null || l2!=null || carry!=0) {

            // Take values only if the linked list is not fully
            // parsed. if they are of different size
            // one of them will end soon

            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;

            // Calculate every time the carry and sum
            carry = sum / 10;
            rem = sum % 10;


            // Create a new node with remainder
            // and move the pointer ahead
            node=node.next = new ListNode(rem);


            // You should only move the list if it has not reached last
            l1 = (l1 != null ? l1.next : null);
            l2 = (l2 != null ? l2.next : null);

        }
        // As the first node is empty we will pass the second one.
           return head.next;


        }


//         while(l!=null)
//         {
//             ListNode temp= new ListNode();
//             temp.next=null;
//
//
//             value=l1.val+count;
//
//         }


    public static void main(String[] args)
    {


        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(9);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(9);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=null;




        ListNode l7 = new ListNode(9);
        ListNode l8 = new ListNode(9);
        ListNode l9 = new ListNode(9);
        ListNode l10 = new ListNode(9);

        l7.next=l8;
        l8.next=l9;
        l9.next=l10;
        l10.next=null;

        printLinkedlist(l1);
        printLinkedlist(l7);
//        l4.next=l5;


        ListNode l11 = addTwoNumbers_Optimised(l1,l7) ;

        printLinkedlist(l11);

        anotherTest();
    }


    public static  void anotherTest()
    { ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(9);

        l1.next=l2;
        l2.next=l3;
        l3.next=null;

        ListNode l7 = new ListNode(5);
        ListNode l8 = new ListNode(6);
        ListNode l9 = new ListNode(4);
        ListNode l10 = new ListNode(9);

        l7.next=l8;
        l8.next=l9;
        l9.next=l10;
        l10.next=null;

        ListNode l11=addTwoNumbers_Optimised(l1,l7);
        printLinkedlist(l1);
        printLinkedlist(l7);
        printLinkedlist(l11);

    }

    public static void printLinkedlist(ListNode temp1)
    {

        ListNode temp=temp1;
        while(temp!=null)
        {
            System.out.print(temp.val + " -- > ");
            temp=temp.next;

        }
        System.out.println("End");
    }

}
