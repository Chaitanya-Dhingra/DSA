package dynamicProgramming;

import java.util.Scanner;

// finding nth fibonacci number
public class overlappingSubproblemFibonacci {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num= findFibonacci(n);
        System.out.println(num);
        System.out.println(funcEntered);
    }
    static int funcEntered=0;

    //without using DP
//    static int findFibonacci(int n) {
//        return helper(n);
//    }
//
//    static int helper(int n) {
//        funcEntered++;
//        if(n==1 || n==2) return 1;
//        else return helper(n-1)+helper(n-2);
//    }

    //with using DP
    static int findFibonacci(int n)
    {
        int[] arr= new int[n+1];
        for(int i=1;i<=n;i++) arr[i]=-1;

        return helper(arr,n);
    }

    static int helper(int[] arr, int n)
    {
        funcEntered++;
        if(n==1 || n==2) return 1;
        if(arr[n]!=-1) return arr[n];
        else return arr[n]= helper(arr,n-1)+helper(arr, n-2);
    }
}
