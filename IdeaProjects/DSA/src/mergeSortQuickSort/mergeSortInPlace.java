package mergeSortQuickSort;

import java.util.Arrays;
public class mergeSortInPlace {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr,int start, int end)
    {
        if(end-start==1)
        {
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr, int start, int mid, int end)
    {
        int[] mix=new int[end-start];
        int i=start, j=mid,k=0;
        while(i<mid && j<end)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid)
        {
            mix[k]=arr[i];
            k++; i++;
        }
        while(j<end)
        {
            mix[k]=arr[j];
            j++; k++;
        }
        for(int m=0;m<mix.length;m++)
        {
            arr[start+m]=mix[m];
        }
    }

}
