package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class diagMaze {
    public static void main(String[] args) {
        ArrayList<String> paths=new ArrayList<>();
        paths=findPaths(3,3,"",paths);
        System.out.println(paths);
    }
    public static ArrayList<String> findPaths(int r, int c, String path,ArrayList<String> paths) {
        if(r==1 && c==1)
        {
            paths.add(path);
            return paths;
        }
        if(r>1 && c>1)
        {
            findPaths(r-1,c-1,path+"d",paths);
        }
        if(r>1)
        {
            findPaths(r-1,c,path+"D",paths);
        }
        if(c>1)
        {
            findPaths(r,c-1,path+"R",paths);
        }
        return paths;
    }
}
