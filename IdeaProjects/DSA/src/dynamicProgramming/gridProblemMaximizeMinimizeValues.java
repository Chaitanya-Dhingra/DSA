package dynamicProgramming;

import java.util.Arrays;

//finding minimum path from top left to bottom right of a given grid
public class gridProblemMaximizeMinimizeValues {
    static void main() {
        int[][] grid= {{1,5,9},
                       {6,2,8},
                       {3,7,4}};
        int min= solveGrid(grid, 0, 0);
        System.out.println(min);
        System.out.println(funcEntered);
    }
     static int funcEntered=0;

    //without DP
//    static int solveGrid(int[][] grid, int row, int col) {
//        funcEntered++;
//        int n=grid.length;
//        int m=grid[0].length;
//        if(row>=n || col>=m) return Integer.MAX_VALUE;
//        if(row==n-1 && col==m-1) return grid[row][col];
//
//        return grid[row][col]+Math.min(solveGrid(grid, row+1, col), solveGrid(grid, row, col+1));
//    }


    //with DP
    static int[][] dp;

    static int solveGrid(int[][] grid, int row, int col) {
        if (dp == null) {
            dp = new int[grid.length][grid[0].length];
            for (int[] r : dp) Arrays.fill(r, -1);
        }
        funcEntered++;
        int n= grid.length;
        int m= grid[0].length;
        if(row>=n || col>=m) return Integer.MAX_VALUE;
        if(row==n-1 &&  col==m-1) return grid[row][col];
        if(dp[row][col]!=-1) return dp[row][col];

        return dp[row][col]= grid[row][col] + Math.min(solveGrid(grid, row+1, col), solveGrid(grid, row, col+1));
    }
}
