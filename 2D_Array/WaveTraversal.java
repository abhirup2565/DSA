import java.util.*;
public class WaveTraversal{
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

        for(int i=0;i<c;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<r;j++)
                {
                    System.out.println(arr[j][i]);
                }
            }
            else
            {
                for(int j=r-1;j>=0;j--)
                {
                    System.out.println(arr[j][i]);
                }
            }
        }
    }
}