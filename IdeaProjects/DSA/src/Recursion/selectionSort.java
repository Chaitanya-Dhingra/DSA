package Recursion;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={3,2,1,4};
        sort(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int it){
        if(it>=arr.length-1){
            return;
        }
        int maxIndex=findMaxIndex(arr,0,arr.length-1-it);
        int correctIndex=arr.length-1-it;
        swap(arr,maxIndex,correctIndex);
        sort(arr,it+1);
    }
    public static int findMaxIndex(int[] arr,int start,int end){
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
