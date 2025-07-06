import java.util.Scanner;
public class StocksMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values in array");
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int profit=0;
        for(int i=0;i<n-1;i++)
            {   
                if (arr[i]<arr[i+1])
                {
                    profit+=arr[i+1]-arr[i];
                }
            }
           System.out.println("final Profit is "+profit);
        }
 }