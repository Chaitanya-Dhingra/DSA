package BitManipulation;

import java.util.Arrays;
import java.util.Scanner;
public class Nrepeatingelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the freq of repeating number:");
        int n=sc.nextInt();
        System.out.println("Enter the total number of elements:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i< size;i++)
        {
            arr[i]=sc.nextInt();
            int num=0;
            num=Decimaltobinary(arr[i]);
            sum+=num;
        }
        int[] rem=Getremainder(sum,n);
        System.out.println(Binarytodecimal(rem));
    }
    public static int Decimaltobinary(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return Decimaltobinary(n/2) * 10 + (n % 2);
    }
    public static int Binarytodecimal(int[] num){
        int size=num.length;
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+= (int) (Math.pow(2,i)*num[i]);
        }
        return sum;
    }
    public static int[] Getremainder(int num1,int n){
        int num=num1;
        int length=0;
        while(num1!=0)
        {
            length++;
            num1=num1/10;
        }
        int[] rem_new=new int[length];
        int i=0;
        while(num!=0) {
            int rem=num%10;
            rem_new[i]=rem%n;
            num=num/10;
            i++;
        }
        return rem_new;
    }
}

