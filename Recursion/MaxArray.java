import java.util.Scanner;
public class MaxArray{
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
        int max=arr[0];
        System.out.println(arrprint(arr,n-1,max));
    }
    public static int arrprint(int [] arr,int n,int max)
    {
        if(n==-1)
        {
            return max;
        }
        max=arrprint(arr, n-1,max);
        if(arr[n]>max)
        {
            max=arr[n];
        }
        return max;
    }
}