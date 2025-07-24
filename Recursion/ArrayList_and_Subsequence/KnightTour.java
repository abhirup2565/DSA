import java.util.*;

public class KnightTour {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("chess board size");
        int n = sc.nextInt();
        System.out.println("Starting row");
        int current_row = sc.nextInt();
        System.out.println("Starting coloumn");
        int current_col = sc.nextInt();
        int [] [] board =new int[n][n];
        tour(board,current_row,current_col,"",0);
    }

    public static void tour(int[][] board ,int current_row,int current_col,String tours,int counter)
    {
        board[current_row][current_col]=1;
        counter++;
        if(counter==board.length*board.length)
        {
            System.out.println(tours+current_row+","+current_col);
            return;
        }
       //path1
       if(current_col<board[0].length-1 && current_row>1)
       {
            if(board[current_row-2][current_col+1]!=1){
                tour(board, current_row-2, current_col+1, tours+current_row+","+current_col+"->", counter);
            }
       } 
       //path2
       if(current_col<board[0].length-2 && current_row>0)
       {
        if(board[current_row-1][current_col+2]!=1){
            tour(board, current_row-1, current_col+2, tours+current_row+","+current_col+"->", counter);
        }
            
       } 
       //path3
       if(current_col<board[0].length-2 && current_row<board.length-1 )
       {
        if(board[current_row+1][current_col+2]!=1){
            tour(board, current_row+1, current_col+2, tours+current_row+","+current_col+"->", counter);
        }   
       } 
       //path4
       if(current_col<board[0].length-1 && current_row<board.length-2)
       {
        if(board[current_row+2][current_col+1]!=1){
         tour(board, current_row+2, current_col+1, tours+current_row+","+current_col+"->", counter);   
        }
       } 
       //path5
       if(current_col>0 && current_row<board.length-2)
       {
        if(board[current_row+2][current_col-1]!=1){
            tour(board, current_row+2, current_col-1, tours+current_row+","+current_col+"->", counter);
        }
       } 
       //path6
       if(current_col>1 && current_row<board.length-1)
       {
        if(board[current_row+1][current_col-2]!=1){
            tour(board, current_row+1, current_col-2, tours+current_row+","+current_col+"->", counter);
        }
            
       } 
       //path7
       if(current_col>1 && current_row>0)
       {
        if(board[current_row-1][current_col-2]!=1){
            tour(board, current_row-1, current_col-2, tours+current_row+","+current_col+"->", counter);
        }
            
       } 
       //path8
       if(current_col>0 && current_row>1)
       {
        if(board[current_row-2][current_col-1]!=1){
            tour(board, current_row-2, current_col-1, tours+current_row+","+current_col+"->", counter);
        }
            
       } 
       board[current_row][current_col]=0;
       counter--;
    }
}