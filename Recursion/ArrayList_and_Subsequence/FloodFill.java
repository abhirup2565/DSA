import java.util.*;
public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        // int [][]arr=new int[n][m];
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[0].length;j++)
        //     {
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        int [][] arr={{0,0,0,0},{0,1,0,0},{0,0,0,0}};
        FloodPaths(arr, 0, 0, "");
    }
    public static void FloodPaths(int [] [] maze,int current_row ,int current_col,String path)
    {
        if(current_row==maze.length-1&&current_col==maze[0].length-1)
        {
            System.out.println(path);
            return;
        }
        maze[current_row][current_col]=1;
        //up
        if(current_row>0)
        {
            if(maze[current_row-1][current_col]!=1)
            {
                
                FloodPaths(maze, current_row-1, current_col, path+"up,");

            }
        }
        //right
        if(current_col<maze[0].length-1)
        {
           if(maze[current_row][current_col+1]!=1)
            {
                
                FloodPaths(maze, current_row, current_col+1, path+"R,");

            }
        }
        //down
        if(current_row<maze.length-1)
        {
            if(maze[current_row+1][current_col]!=1)
        {
            
            FloodPaths(maze, current_row+1, current_col, path+"dw,");
        }
        }
        //left
        if(current_col>0)
        {
            if(maze[current_row][current_col-1]!=1)
            {
                
                FloodPaths(maze, current_row, current_col-1, path+"L,");

            }
        }
        maze[current_row][current_col]=0;
    }
}
