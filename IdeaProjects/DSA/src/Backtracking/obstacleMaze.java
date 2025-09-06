package Backtracking;

import java.util.ArrayList;

// Only right or down movement
public class obstacleMaze {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        ArrayList<String> paths=new ArrayList<>();
        paths=findPaths(maze,0,0,"",paths);
        System.out.println(paths);
        int countWays=0;
        countWays= ways(maze,0,0);
        System.out.println(countWays);
    }
    public static ArrayList<String> findPaths(boolean[][] maze, int r,int c, String path, ArrayList<String> paths)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            paths.add(path);
            return paths;
        }
        if(!maze[r][c])
        {
            return paths;
        }
        if(r<maze.length-1)
        {
            findPaths(maze,r+1,c,path+"D",paths);
        }
        if(c<maze[0].length-1)
        {
            findPaths(maze,r,c+1,path+"R",paths);
        }
        return paths;
    }
    public static int ways(boolean[][] maze, int r, int c)
    {
        int count=0;
        if(r==maze.length-1 || c==maze[0].length-1)
        {
            return 1;
        }
        if(!maze[r][c])
        {
            return 0;
        }
        count+=ways(maze,r+1,c)+ways(maze,r,c+1);
        return count;
    }
}
