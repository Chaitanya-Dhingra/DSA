package dynamicProgramming;

/* Given an array of integer, find the subsequence with the largest sum such that no two
picked elements are adjacent and return the sum */

import java.util.*;

public class maxSubsequence {
    static void main() {
        int[] arr= {1,4,2,-10, 10, 5};
        int sum= findMax(arr);
        System.out.println(sum);
    }

    static int findMax(int[] arr) {
        int n=arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];

        int[] dp=new int[n];
        dp[0]=arr[0];
        dp[1]=arr[1];

        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        return dp[n-1];
    }

}
