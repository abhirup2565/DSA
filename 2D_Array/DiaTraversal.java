import java.util.*;
public class DiaTraversal{
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

        for(int g =0;g<arr[0].length;g++)
        {
            for(int i=0,j=g;j<arr[0].length;i++,j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}