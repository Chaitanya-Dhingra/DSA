package LinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL()
    {
        this.size=0;
    }

    private class Node
    {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next, Node prev)
        {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void display()
    {
        Node node=head;
        while(node!=null)
        {
            System.out.print(node.value+"->");
            node=node.next;
        }
        System.out.println("NULL");
    }

    public void displayReverse()
    {
        Node node=tail;
        while(node!=null)
        {
            System.out.print(node.value+"->");
            node=node.prev;
        }
        System.out.println("NULL");
    }

    public int length()
    {
        return size;
    }

    public void insertFirst(int value)
    {
        Node node= new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null)
        {
            head.prev = node;
        }
        head = node;
        if(tail==null)
        {
            tail = node;
        }
        size++;
    }

    public void insertLast(int value)
    {
        Node node= new Node(value);
        if(head==null || tail==null)
        {
            head = node;
            tail = node;
            tail.next = null;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        tail.next = null;
        size++;
    }

    public void insert(int value, int index)
    {
        Node node= new Node(value);
        if(index>size-1)
        {
            return;
        }
        if(index==0)
        {
            insertFirst(value);
        }
        if(index==size-1)
        {
            insertLast(value);
        }
        else
        {
            int curr=0;
            Node pointer=head;
            while(++curr!=index)
            {
                pointer=pointer.next;
            }
            node.next=pointer.next;
            pointer.next.prev=node;
            pointer.next=node;
            node.prev=pointer;
            size++;
        }
    }
}
