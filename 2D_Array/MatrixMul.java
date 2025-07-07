import java.util.*;
public class MatrixMul{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row ");
        int r1 = sc.nextInt();
        System.out.println("Enter size of column ");
        int c1 = sc.nextInt();
        int m1[][] = new int[r1][c1];

        System.out.println("Enter size of row ");
        int r2 = sc.nextInt();
        System.out.println("Enter size of column ");
        int c2 = sc.nextInt();
        int m2[][] = new int[r2][c2];
        int ans[][]=new int[r1][c2];
        System.out.println("Enter values in 1st array");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter values in 2nd array");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                m2[i][j]=sc.nextInt();
            }
        }

        if(c1!=r2)
        {
            System.out.println("Matrix cant be multiplied");
        }
        else
        {
            
            for(int k=0;k<r1;k++)
            {
                for(int i=0;i<r1;i++)
                {   
                    int mul=0;
                    for(int j=0;j<c1;j++)
                    {
                        mul+=m1[i][j]*m2[j][i];
                    }
                    ans[k][i]=mul;
                }
            }
            
        }


        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(ans[i][j]+"\t");
            }
            System.out.println();
        }
    }
}