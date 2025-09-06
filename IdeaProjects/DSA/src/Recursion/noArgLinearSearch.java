package Recursion;

import java.util.*;

public class noArgLinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5};
        ArrayList<Integer> indices=new ArrayList<Integer>();
        indices=search(arr,3,0);
        System.out.println(indices.isEmpty()?-1:indices.toString());
    }
    public static ArrayList<Integer> search(int[] arr,int target,int start){
        ArrayList<Integer> index=new ArrayList<>();
        if(start==arr.length)
        {
            return index;
        }
        if(arr[start]==target)
        {
            index.add(start);
        }
        ArrayList<Integer> lowerCall=search(arr,target,start+1);
        index.addAll(lowerCall);
        return index;
    }
}
