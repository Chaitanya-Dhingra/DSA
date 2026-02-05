package StacksAndQueues;

public class dynamicStack extends customStack {

    public dynamicStack() {
        super(); //calls custom stack
    }

    public dynamicStack(int size) {
        super(size); //calls customSize(int size)
    }

    @Override
    public boolean push(int value) {
        if(this.isFull())
        {
            int[] temp= new int[data.length*2];
            for(int i=0;i<data.length;i++) temp[i]=data[i];
            data=temp;
        }
        return super.push(value); //customStack push()
    }
}
