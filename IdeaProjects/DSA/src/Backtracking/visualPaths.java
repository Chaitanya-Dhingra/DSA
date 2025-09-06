package Backtracking;

import java.util.Arrays;

public class visualPaths {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] paths=new int[maze.length][maze[0].length];
        allPaths(maze,"",0,0,paths,1);
    }

    public static void allPaths(boolean[][] maze, String p, int r, int c,int[][]paths, int steps)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            paths[r][c]=steps;
            for(int[] arr: paths)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]) return;
        maze[r][c]=false;
        paths[r][c]=steps;
        if(r>0)
        {
            allPaths(maze,p+"U",r-1,c,paths,steps+1);
        }
        if(c>0)
        {
            allPaths(maze,p+"L",r,c-1,paths,steps+1);
        }
        if(r<maze.length-1)
        {
            allPaths(maze,p+"D",r+1,c,paths,steps+1);
        }
        if(c<maze[0].length-1)
        {
            allPaths(maze,p+"R",r,c+1,paths,steps+1);
        }
        maze[r][c]=true;
        paths[r][c]=0;
    }
}
