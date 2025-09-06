package Recursion;

public class CountZero {
    public static void main(String[] args) {
        int n= 1230000;
        int count=countzero(n);
        System.out.println(count);
    }
    public static int countzero(int n) {
        return helper(n,0);
    }
    public static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+=1);
        }
        else{
            return helper(n/10,c);
        }
    }
}
