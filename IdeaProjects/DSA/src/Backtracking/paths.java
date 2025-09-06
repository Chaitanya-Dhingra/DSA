package Backtracking;

import java.util.ArrayList;

public class paths {
    public static void main(String[] args) {
        ArrayList<String> ways = new ArrayList<String>();
        findPaths(3,3,"",ways);
        System.out.println(ways);
    }
    public static ArrayList<String> findPaths(int r, int c, String RD, ArrayList<String> ways) {
        if (r == 1 && c == 1) {
            ways.add(RD);
            return ways;
        }
        else if(c==1 && r!=1)
        {
            findPaths(r-1,c,RD+"D",ways);
        }
        else if(c!=1 && r==1)
        {
            findPaths(r,c-1,RD+"R",ways);
        }
        else {
            findPaths(r - 1, c, RD + "D", ways);
            findPaths(r, c - 1, RD + "R", ways);
        }
        return ways;
    }
}
