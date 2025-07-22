public class Queens {
    public static void main(String [] args)
    {
        int [] [] board =new int[4][4];
        int targetQueen=3;
        path(board, 0, 0, 0, targetQueen, "");
    }
    public static void path(int[][] board,int currentQueen,int current_row,int current_col,int targetQueen,String postions)
    {
        if(currentQueen==targetQueen)
        {
            System.out.println(postions);
            return;
        }

        fill(board, current_row, current_col, 1);
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]!=1)
                {
                    current_row=i;
                    current_col=j;
                    path(board, currentQueen+1, current_row, current_col, targetQueen, postions+i+"-"+j+",");
                }
            }
        }
        fill(board, current_row, current_col, 0);
    }


   public static int[][] fill(int[][] board,int current_row,int current_col,int value)
    {
        board[current_row][current_col]=1;
        //fill horizontal
        int h=0;
        while(h<board[0].length)
        {
        board[current_row][h]=value;
        h++;
        }
        //fill vertical
        int v=0;
        while(v<board.length)
        {
        board[v][current_col]=value;
        v++;
        }
        //diagonals
        int r=current_row-1;
        int lc =current_col-1;
        int rc =current_col+1;
        //downward diagonal
        while(r>=0)
        {
            if(lc>=0)
            {
                board[r][lc]=value;
            }
            if(rc<board[0].length)
            {
                board[r][rc]=value;
            }
            rc++;
            lc--;
            r--;
        }
        //upward diagonal
        r=current_row+1;
        lc =current_col-1;
        rc =current_col+1;
        while(r<board.length)
        {
            if(lc>=0)
            {
                board[r][lc]=value;
            }
            if(rc<board[0].length)
            {
                board[r][rc]=value;
            }
            rc++;
            lc--;
            r++;
        }
        return board;
    }
}
