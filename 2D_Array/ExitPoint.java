import java.util.*;
public class ExitPoint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row ");
        int r = sc.nextInt();
        System.out.println("Enter size of column ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter values in array");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int current_row=0;
        int current_col=0;
        int max_row=r;
        int max_col=c;
        int exit_col=0;
        int exit_row=0;

        while(current_col<max_col && current_col>=0 && current_row<max_row && current_row>=0)
        {
            for(int i=current_col;i<max_col;i++)
            {
                if(arr[current_row][current_col]==1)
                {
                    current_row++;
                    break;
                }
                current_col++;
                if(current_col>=max_col)
                {
                    exit_col=current_col-1;
                }
            }
            for(int i=current_row;i<max_row;i++)
            {
                if(arr[current_row][current_col]==1)
                {
                    current_col--;
                    break;
                }
                current_row++;
                if(current_row>=max_row)
                {
                    exit_row=current_row-1;
                }
            }
            for(int i=current_col;i>=0;i--)
            {
                if(arr[current_row][current_col]==1)
                {
                    current_row--;
                    break;
                }
                current_col--;
                if(current_col<0)
                {
                    exit_col=0;
                }
            }
            for(int i=current_row;i>=0;i--)
            {
                if(arr[current_row][current_col]==1)
                {
                    current_col++;
                    break;
                }
                current_row--;
                if(current_row<0)
                {
                    exit_row=0;
                }
            } 
        }
        System.out.println(exit_row+" , "+exit_col);
        
    }
}