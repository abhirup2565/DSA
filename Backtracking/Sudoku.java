public class Sudoku {
    public static void main(String[] args) {
        int [] [] board = {{3,0,6,5,0,8,4,0,0},
                            {5,2,0,0,0,0,0,0,0},
                            {0,8,7,0,0,0,0,3,1},
                            {0,0,3,0,1,0,0,8,0},
                            {9,0,0,8,6,3,0,0,5},
                            {0,5,0,0,9,0,6,0,0},
                            {1,3,0,0,0,0,2,5,0},
                            {0,0,0,0,0,0,0,7,4},
                            {0,0,5,2,0,6,3,0,0}};
        solveSudoku(board, 0, 0);
    }
    public static void solveSudoku(int [][] board,int row,int col) 
    {
        if(row == board.length)
        {
           display(board);
           return;
        }
        int nextRow = 0;
        int nextCol = 0;
        if(col == board.length-1)
        {
            nextRow = row+1;
            nextCol = 0;
        }
        else
        {
            nextRow = row;
            nextCol = col+1;
        }
        if(board[row][col] != 0)
        {
            solveSudoku(board, nextRow, nextCol);
        }    
        else
        {
            for(int value =0; value<10; value++)
            {
                if(isVaid(board,row,col,value)==true)
                {
                    board[row][col]=value;
                    solveSudoku(board, nextRow, nextCol);
                    board[row][col]=0;
                }
            }
        }
    }
    public static boolean isVaid(int [][] board,int row,int col,int value) 
    {
        for(int j = 0;j<board.length;j++)
        {
            if(board[row][j]==value || board[j][col]==value)
            {
                return false;
            }
        }
        int boxRow = (row/3)*3;
        int boxCol = (col/3)*3;
        for(int i = boxRow;i<boxRow+3;i++)
        {
            for(int j = boxCol;j<boxCol+3;j++)
            {
                if(board[i][j]==value)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int [][] board)
    {
        for(int i = 0;i<board.length;i++)
        {
            for(int j = 0;j<board.length;j++)
            {
                System.out.print("|"+board[i][j]+"|");
            }
            System.out.println("");
        }
    }
}
