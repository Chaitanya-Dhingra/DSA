package Recursion;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int n=1234;
        int rev=reverse(n,helper(n));
        System.out.println(rev);
    }
    public static int helper(int n){
        int digits=(int)(Math.log10(n))+1;
        return digits;
    }
    public static int reverse(int n,int digits) {
        if(n!=0)
        {
            return (int) (Math.pow(10,digits-1)*(n%10)+reverse(n/10,helper(n/10)));
        }
        return n;
    }
}
