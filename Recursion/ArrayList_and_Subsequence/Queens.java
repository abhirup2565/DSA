import java.util.*;

public class Queens {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("chess board size");
        int n = sc.nextInt();
        int [] [] board =new int[n][n];
        path(board,"",0);
    }

    public static void path(int[][] board ,String postions,int row)
    {
        if(row==board.length)
        {
            System.out.println(postions+".");
            return;
        }
        for(int col=0;col<board[0].length;col++)
        {
            if(safePos(board, row, col))
            {
                board[row][col]=1;
                path(board, postions+row+"-"+col+",", row+1);
                board[row][col]=0;
            }
        }
    }
    public static boolean safePos(int [][]board,int row,int col)
    {
        for(int i=row-1,j=col;i>=0;i--)
        {
            if(board[i][j]==1)
            {
                return false;
            }
            
        }
        for(int i=row-1, j=col-1;i>=0&&j>=0; i--, j--)
        {
            if(board[i][j]==1)
            {
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++)
        {
            if(board[i][j]==1)
            {
                return false;
            }
        }
        return true;
    }
}