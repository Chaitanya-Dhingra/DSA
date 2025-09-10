package LinkedList;


public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL()
    {
        this.size=0;
    }

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next=next;
        }
    }

    public void insertFirst(int value)
    {
        Node node=new Node(value);
        if(head==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            node.next=head;
            head=node;
            tail.next=head;
        }
        size++;
    }

    public void insertLast(int value)
    {
        Node node=new Node(value);
        if(tail==null)
        {
            insertFirst(value);
            return;
        }
        tail.next=node;
        tail=node;
        tail.next=head;
        size++;
    }

    public void display()
    {
        Node node=head;
        if(head!=null)
        {
            do {
                System.out.print(node.value+"->");
                node=node.next;
            } while(node != head);
            System.out.println("HEAD");
        }
    }
}
