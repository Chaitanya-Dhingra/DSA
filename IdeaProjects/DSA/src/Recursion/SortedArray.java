package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,8,4,3};
        boolean isSorted=Sorted(arr);
        System.out.println(isSorted);
    }
    public static boolean Sorted(int[] arr){
        return helper(arr,0,true);
    }
    public static boolean helper(int[] arr,int start,boolean isAsc){
        if(start==arr.length-1){
            return isAsc;
        }
        return helper(arr,start+1,isAsc&=(arr[start]<arr[start+1]));
    }
}
