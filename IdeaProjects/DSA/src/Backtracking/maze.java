package Backtracking;

public class maze {
    public static void main(String[] args) {
        int totalPaths= paths(3,3);
        System.out.println(totalPaths);
    }
    //Only down-right movement
    public static int paths(int r, int c)
    {
        int count=0;
        if(r==1 || c==1)
        {
            return 1;
        }
        count+=paths(r,c-1)+paths(r-1,c);
        return count;
    }
}

