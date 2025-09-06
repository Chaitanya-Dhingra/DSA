package Recursion;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        sort(arr,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int r, int c){
        if(r>arr.length-1){
            return;
        }
        if(c>arr.length-2-r){
            sort(arr,r+1,0);
        }
        else{
            if(arr[c]>arr[c+1]){
                swap(arr,c,c+1);
            }
            sort(arr,r,c+1);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
