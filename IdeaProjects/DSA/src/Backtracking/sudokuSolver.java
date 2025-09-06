package Backtracking;

public class sudokuSolver {
    public static void main(String[] args) {
        int[][] board={
                {0, 0, 0, 2, 6, 0, 7, 0, 1},
                {6, 8, 0, 0, 7, 0, 0, 9, 0},
                {1, 9, 0, 0, 0, 4, 5, 0, 0},
                {8, 2, 0, 1, 0, 0, 0, 4, 0},
                {0, 0, 4, 6, 0, 2, 9, 0, 0},
                {0, 5, 0, 0, 0, 3, 0, 2, 8},
                {0, 0, 9, 3, 0, 0, 0, 7, 4},
                {0, 4, 0, 0, 5, 0, 0, 3, 6},
                {7, 0, 3, 0, 1, 8, 0, 0, 0}

        };
        if(solve(board)) display(board);
        else System.out.println("No solution");
    }

    public static boolean solve(int[][] board)
    {
        int n=board.length;
        int row=-1, col=-1;
        boolean empty=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0)
                {
                    row=i; col=j;
                    empty=false;
                    break;
                }
            }
            if(!empty) break;
        }

        if(empty) return true;

        for(int num=1; num<=9; num++)
        {
            if(isSafe(board,row,col,num))
            {
                board[row][col]=num;
                if(solve(board)) return true;
                else board[row][col]=0;
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int num)
    {
        //check for row
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col] == num) return false;
        }

        // check for column
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i] == num) return false;
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart= row-row%sqrt;
        int colStart= col-col%sqrt;
        //check for 3x3 boxes
        for(int r=rowStart;r<rowStart+sqrt;r++)
        {
            for(int c=colStart;c<colStart+sqrt;c++)
            {
                if(board[r][c] == num) return false;
            }
        }
        return true;
    }

    public static void display(int[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
