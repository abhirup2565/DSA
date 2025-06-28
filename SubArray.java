import java.util.Scanner;
public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values in array");
         for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int limit = (int)Math.pow(2, n);

        for(int i=0 ;i<limit;i++)
        {
            int temp=i;
            for(int j=n-1;j>=0;j--)
            {
                int k = temp%2;
                temp=temp/2;
                if(k==0)
                {
                    System.out.print("\t_");
                }
                else
                {
                    System.out.print("\t"+arr[j]);
                }
            }
            System.out.println("");
        }
    }
}