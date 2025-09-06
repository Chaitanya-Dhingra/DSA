package Recursion;

public class pattern1 {
    public static void main(String[] args) {
        int r=4;
        triangle(r,0);
    }
    public static void triangle(int r, int c) {
        if(r==0)
        {
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        }
        else{
            System.out.println("");
            triangle(r - 1, 0);
        }
    }
}
