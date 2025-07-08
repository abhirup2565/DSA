import java.util.*;
public class ShellRotate{
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
        System.out.println("Enter Shell number ");
        int shell = sc.nextInt();
        System.out.println("Enter number of rotation ");
        int rotation = sc.nextInt();

        //rotating shell function
        rotate(arr, shell, rotation);
        
        //print matrix
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
        
        
    }
    public static void rotate(int [][] arr, int shell,int rotation)
    {
       
        int r=0;
        while(r<rotation)
        {
             int max_row=arr.length-shell;
        int max_col=arr[0].length-shell;
        int min_row=shell-1;
        int min_col=shell-1;
        int temp=arr[min_row][min_col];
            //top side
            for(int j=min_col+1;j<=max_col;j++)
            {
                arr[min_row][j-1]=arr[min_row][j];
            }
            min_row++;
            //right side
            for(int i=min_row;i<=max_row;i++)
            {
                arr[i-1][max_col]=arr[i][max_col];
            }
            max_col--;
            //for bottom
            for(int j=max_col;j>=min_col;j--)
            {
                arr[max_row][j+1]=arr[max_row][j];
            }
            max_row--;
            //for left side
            for(int i=max_row;i>=min_row;i--)
            {
                arr[i+1][min_col]=arr[i][min_col];
            }
            min_col++;

            arr[min_row][min_col-1]=temp;
            r++;
        }

    }
}
