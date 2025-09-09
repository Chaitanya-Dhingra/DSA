package LinkedList;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size=0;
    }

    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }

    public void insertLast(int val)
    {
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val, int index)
    {
        if(index<0 || index>size)
        {
            return;
        }
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if(index==size-1)
        {
            insertLast(val);
            return;
        }
        else
        {
            Node node= new Node(val);
            Node temp= head;
            int counter=0;
            while(++counter != index)
            {
                temp=temp.next;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
        }
    }

    public void deleteFirst()
    {
        if(size==0)
        {
            return;
        }
        Node temp= head;
        head=head.next;
        temp.next=null;
        if(head==null)
        {
            tail=null;
        }
        size--;
    }

    public void deleteLast()
    {
        if(size==0)
        {
            return;
        }
        Node temp= head;
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size--;
    }

    public void delete(int index) {
        if (index == 0)
        {
            deleteFirst();
            return;
        }
        if(index==size-1)
        {
            deleteLast();
            return;
        }
        if(index>size)
        {
            return;
        }
        Node temp= head;
        int counter=0;
        while(++counter != index)
        {
            temp=temp.next;
        }
        Node nxt=temp.next.next;
        temp.next.next=null;
        temp.next=nxt;
        size--;
    }

    public void display()
     {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("NULL\n");
    }

    public void length()
    {
        System.out.println(size);
    }

    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value, Node next)
        {
            this.value=value;
            this.next=next;
        }
    }

}
