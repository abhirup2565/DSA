import java.util.*;
public class SaddlePoint {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int r = sc.nextInt();
        System.out.println("Enter the column");
        int c = sc.nextInt();
        int[] [] arr= new int[r][c];
        System.out.println("Enter the value");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) 
            {
                arr[i][j]=sc.nextInt();
            }
               
        }

        for(int i=0;i<r;i++){
            int min=arr[i][0];
            int col=0;
            for(int j=0;j<c;j++) 
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                    col=j;
                }
            }
            boolean ans = saddle(arr,i,col);

            if(ans)
            {
                System.out.println("Saddle point is "+arr[i][col]);
                break;
            }      
        }
    }
    
    public static boolean saddle(int[][]arr,int row,int col)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[row][col]<arr[i][col])
            {
                return false;
            }
        }
        return true;
    }
}
