package Backtracking;

public class nKnights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        knight(board,0,0,4);
    }
    public static void knight(boolean[][] board, int r, int c, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (r == board.length - 1 && c == board[0].length)
        {
            return;
        }

        if(c==board.length)
        {
            knight(board,r+1,0,knights);
            return;
        }
        if(isSafe(board,r,c))
        {
            board[r][c] = true;
            knight(board,r,c+1,knights-1);
            board[r][c] = false;
        }

        knight(board,r,c+1,knights);
    }

    public static boolean isSafe(boolean[][] board, int r, int c)
    {
        if(isValid(board,r-2,c-1))
        {
            if(board[r-2][c-1]) return false;
        }
        if(isValid(board,r-2,c+1))
        {
            if(board[r-2][c+1]) return false;
        }
        if(isValid(board,r-1,c+2))
        {
            if(board[r-1][c+2]) return false;
        }
        if(isValid(board,r-1,c-2))
        {
            if(board[r-1][c-2]) return false;
        }
        return true;
    }

    public static boolean isValid(boolean[][] board, int r, int c)
    {
        if(r>=0 && r<board.length && c>=0 && c<board[r].length) return true;
        return false;
    }

    public static void display(boolean[][] board)
    {
        for(boolean[] row: board)
        {
            for(boolean col: row)
            {
                if(col) System.out.print("K ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }
}
