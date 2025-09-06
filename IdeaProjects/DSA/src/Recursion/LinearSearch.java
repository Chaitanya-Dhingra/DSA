package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

// much more efficient approach towards this problem would be using ArrayList instead of String concatenation
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,5};
        ArrayList<Integer> list=new ArrayList<>();
        search(arr,3,0,list);
        System.out.println(list.isEmpty()?-1:list.toString());
//        String index=search(arr,4,0);
//        System.out.println(index.isEmpty()?"-1":index.trim());
    }
    public static void search(int[] arr, int target, int index, ArrayList<Integer> result)
    {
        if(index==arr.length) return;
        if(arr[index]==target)
        {
            result.add(index);
        }
        search(arr,target,index+1,result);
    }
//    public static String search(int[] arr, int target, int index) {
//        if(index>=arr.length)
//        {
//            return "";
//        }
//        if(arr[index]==target)
//        {
//            return index+" "+search(arr,target,index+1);
//        }
//        return search(arr,target,index+1);
//    }
}
