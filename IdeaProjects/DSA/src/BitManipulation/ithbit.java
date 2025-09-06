package BitManipulation;

public class ithbit {
    public static void main(String[] args) {
        int n=11;
        int ith=3;
        System.out.println(bit(n,ith));
    }

    public static int bit(int n, int i) {
        return (n&(1<<(i-1)))>>(i-1);
//        return n>>(i-1);
    }
}
