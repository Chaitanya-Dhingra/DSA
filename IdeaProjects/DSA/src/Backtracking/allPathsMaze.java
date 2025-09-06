package Backtracking;

import java.util.ArrayList;

public class allPathsMaze {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int countPaths=0;
        countPaths=countAllPaths(maze,0,0);
        System.out.println(countPaths);
        ArrayList<String> paths=new ArrayList<String>();
        paths=allPaths(maze,0,0,"",paths);
        System.out.println(paths);
    }

    public static int countAllPaths(boolean[][] maze,int r,int c)
    {
        int count=0;
        if(r < 0 || c < 0 || r >= maze.length || c >= maze[0].length || !maze[r][c])
        {
            return 0;
        }
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            return 1;
        }
        maze[r][c]=false;
        count+=countAllPaths(maze,r+1,c)+countAllPaths(maze,r,c+1)+countAllPaths(maze,r-1,c)+countAllPaths(maze,r,c-1);
        maze[r][c]=true;
        return count;
    }

    public static ArrayList<String> allPaths(boolean[][] maze,int r,int c,String path,ArrayList<String> paths)
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
        maze[r][c]=false;
        if(r<maze.length-1)
        {
            allPaths(maze,r+1,c,path+"D",paths);
        }
        if(c<maze[0].length-1)
        {
            allPaths(maze,r,c+1,path+"R",paths);
        }
        if(r>0)
        {
            allPaths(maze,r-1,c,path+"U",paths);
        }
        if(c>0)
        {
            allPaths(maze,r,c-1,path+"L",paths);
        }
        maze[r][c]=true;
        return paths;
    }
}
