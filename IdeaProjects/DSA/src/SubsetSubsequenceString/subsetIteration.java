package SubsetSubsequenceString;
import java.util.*;
public class subsetIteration {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> sub= subset(arr);
        for(List<Integer> ans:sub)
        {
            System.out.println(ans);
        }
    }
    public static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: nums)
        {
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal= new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
