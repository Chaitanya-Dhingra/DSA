package StacksAndQueues;

import java.util.EmptyStackException;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public customStack()
    {
        this(DEFAULT_SIZE); //this function will call customStack(int size)
    }

    public customStack(int size)
    {
        this.data= new int[size];
    }

    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Cannot pop from empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    private boolean isFull()
    {
        return ptr==data.length-1; //ptr is at last index
    }

    private boolean isEmpty()
    {
        return ptr==-1;
    }
}
