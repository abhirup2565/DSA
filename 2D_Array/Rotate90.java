import java.util.*;
public class Rotate90{
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
        int temp;
        //transpose the matrix
        for(int i=0;i<r;i++)
        {
            for(int j=i;j<c;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //reverse each column
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c/2;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[i][(c-1)-j];
                arr[i][(c-1)-j]=temp;
            }
        }
        //print the matrix
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
        
    }
}