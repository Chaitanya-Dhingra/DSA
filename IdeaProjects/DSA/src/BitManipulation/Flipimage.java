package BitManipulation;

import java.util.Arrays;

public class Flipimage {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        flip(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    public static void flip(int[][] arr){
        int m=arr.length;;
        int n=arr[0].length;
        for(int i=0;i<m;i++)
        {
            int start=0, end=arr[i].length-1;
            while(start<end)
            {
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++; end--;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]^=1;
            }
        }
    }
}
