import java.util.*;
public class NQueens {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the board length");
        int n = sc.nextInt();
        boolean [][] board = new boolean[n][n];

        boolean[] cols = new boolean[n];
        boolean[] ndia = new boolean[2*n-1];
        boolean[] revdia = new boolean[2*n-1];

        solve(board,0,cols,ndia,revdia,"");
    }
    public static void solve(boolean [][] board, int row, boolean[] cols, boolean[] ndia, boolean[] revdia, String asf)
    {
        if(row==board.length)
        {
            System.out.println(asf+".");
            return;
        }
        for(int col = 0; col<board[0].length; col++)
        {
            if(cols[col]==false && ndia[row+col]==false && revdia[row-col+board.length-1]==false)
            {
                board[row][col] = true;
                cols[col]=true;
                ndia[row+col]=true;
                revdia[row-col+board.length-1]=true;
                solve(board,row+1,cols,ndia,revdia,asf+row+"-"+col+", ");
                board[row][col] = false;
                cols[col]=false;
                ndia[row+col]=false;
                revdia[row-col+board.length-1]=false;
                board[row][col] = false;
            }
        }
    }
}