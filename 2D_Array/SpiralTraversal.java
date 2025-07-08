import java.util.*;
public class SpiralTraversal{
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
        int min_row=0;
        int min_col=0;
        int max_row=r-1;
        int max_col=c-1;

        while(min_col<max_col && min_row<max_row)
        {
            //left wall
            for(int i = min_row;i<=max_row;i++)
            {
                System.out.println(arr[i][min_col]);
            }
            min_col++;
            //bottom wall
            for(int j = min_col;j<=max_col;j++)
            {
                System.out.println(arr[max_row][j]);
            }
            max_row--;
            //right wall 
            for(int i = max_row;i>=min_row;i--)
            {
                System.out.println(arr[i][max_col]);
            }
            max_col--;
            //top wall
            for(int j = max_col;j>=min_col;j--)
            {
                System.out.println(arr[min_row][j]);
            }
            min_row++;
        }
        
    }
}