import java.util.ArrayList;
import java.util.List;

class CrossWord {
    public static void main(String[] args) {
        char [] [] board = {{'+','_','+','+','+','+','+','+','+','+'},
                            {'+','_','+','+','+','+','+','+','+','+'},
                            {'+','_','+','+','+','+','+','+','+','+'},
                            {'+','_','_','_','_','_','+','+','+','+'},
                            {'+','_','+','+','+','_','+','+','+','+'},
                            {'+','_','+','+','+','_','+','+','+','+'},
                            {'+','+','+','+','+','_','+','+','+','+'},
                            {'+','+','_','_','_','_','_','_','+','+'},
                            {'+','+','+','+','+','_','+','+','+','+'},
                            {'+','+','+','+','+','_','+','+','+','+'}};
        
    String [] words = {"DELHI","ICELAND","ANKARA","LONDON"};
    solve(board,words,0);
    }
    
    public static void solve(char [] [] board,String[]words,int windx)
    {
        if(windx == words.length)
        {
            print(board);
            return;
        }
        String word = words[windx];
        for(int i = 0;i<board.length;i++)
        {
            for(int j = 0;j<board.length;j++)
            {
                if(board[i][j] == '_'||board[i][j] == word.charAt(0))
                {
                    if(canPlaceHorizontal(board,word,i,j))
                    {
                        boolean[] weplaced=placeHorizontal(board,word,i,j);
                        solve(board, words, windx+1);
                        unPlaceHorizontal(board,word,weplaced,i,j);
                    }
                    if(canPlaceVertical(board,word,i,j))
                    {
                        boolean[] weplaced = placeVerical(board,word,i,j);
                        solve(board, words, windx+1);
                        unPlaceVertical(board,word,weplaced,i,j);
                    }
                }
            }
        }
    }
    public static boolean canPlaceHorizontal(char [][] board,String word,int i,int j)
    {
        if(j-1>=0 && board[i][j-1]!='+')
        {
            return false;
        }
        else if(j+word.length()<board[0].length && board[i][j+word.length()]!='+')
        {
            return false;
        }
        for(int jj = 0 ; jj<word.length();jj++)
        {
            if(j+jj >= board[0].length)
            {
                return false;
            }
            if(board[i][j+jj]=='_' || board[i][j+jj]==word.charAt(jj))
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static boolean canPlaceVertical(char [][] board,String word,int i,int j)
    {
        if(i-1>=0 && board[i-1][j]!='+')
        {
            return false;
        }
        else if(i+word.length()<board[0].length && board[i+word.length()][j]!='+')
        {
            return false;
        }
        for(int ii = 0 ; ii<word.length();ii++)
        {
            if(i+ii >= board.length)
            {
                return false;
            }
            if(board[i+ii][j]=='_' || board[i+ii][j]==word.charAt(ii))
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public static boolean[] placeHorizontal(char [] [] board,String word,int i,int j)
    {
        boolean[] weplaced = new boolean[word.length()]; 
        for(int jj=0;jj<word.length();jj++)
        {
            if(board[i][j+jj] == '_')
            {
                board[i][j+jj] = word.charAt(jj);
                weplaced[jj]=true;
            }
        }
        return weplaced;
    }
    
    public static void unPlaceHorizontal(char[][]board, String word,boolean[] weplaced,int i,int j) {
        for(int jj=0;jj<word.length();jj++)
        {
            if(weplaced[jj]==true)
            {
                board[i][j+jj]='_';
            }
        }
    }

    public static boolean[] placeVerical(char [] [] board,String word,int i,int j)
    {
        boolean[] weplaced = new boolean[word.length()]; 
        for(int ii=0;ii<word.length();ii++)
        {
            if(board[i+ii][j] == '_')
            {
                board[i+ii][j] = word.charAt(ii);
                weplaced[ii]=true;
            }
        }
        return weplaced;
    }
    
    public static void unPlaceVertical(char[][]board, String word,boolean[] weplaced,int i,int j) {
        for(int ii=0;ii<word.length();ii++)
        {
            if(weplaced[ii]==true)
            {
                board[i+ii][j]='_';
            }
        }
    }
    
    public static void print(char [][] board)
    {
        for(int i = 0;i<board.length;i++)
        {
            for(int j = 0;j<board[0].length;j++)
            {
                System.out.print("|"+board[i][j]+"|");
            }
            System.out.println("");
        }
    }
}
