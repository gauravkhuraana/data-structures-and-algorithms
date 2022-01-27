package linkedList.singleLinkedList;

public class linkedListStructure {


    private static Node head;
    private static Node tail;
    private static int size;

    public linkedListStructure()
    {
        this.size=0;
    }


    private static class Node
    {
        int info;
        Node next;

        public Node(int info)
        {
            this.info=info;

        }

    }

    public static void insertNode(int number)
    {
        Node node = new Node(number);

        if(head==null)
        {
            head=node;
            tail=node;

        }
        else if(head==tail)
        {
            head.next=node;
            tail=node;

        }
        else if(head!=tail)
        {
            tail.next=node;
            tail=node;

        }
        size++;

    }

    public static void removeElementFromLast()
    {
        if(head==null)
        {
            System.out.println("There is no element that can be removed");
            return;
        }
        if(head==tail)
        {
            head=tail=null;
            return;
        }
        Node temp;
        temp=head;
        while(temp.next!=null)
        {
            if(temp.next==tail)
            {
                temp.next=null;
                tail=temp;
                return;
            }
            temp=temp.next;
        }

    }


    public static void printLinkedlist()
    {
        Node temp;
        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.info + " -- > ");
            temp=temp.next;

        }
        System.out.println("End");
    }


    public static void printLinkedlist(Node temp)
    {

        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.info + " -- > ");
            temp=temp.next;

        }
        System.out.println("End");
    }


    }

