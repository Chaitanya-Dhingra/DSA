package StacksAndQueues;

public class customQueue {
    private  int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=-1;

    public customQueue()
    {
        this(DEFAULT_SIZE);
    }

    public customQueue(int size)
    {
        this.data= new int[size];
    }

    public boolean isFull()
    {
        return end==data.length;
    }

    public boolean isEmpty()
    {
        return end==0;
    }

    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++]=item;
        return true;
    }
}

