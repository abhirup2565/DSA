import java.util.Scanner;
public class AllOccur{
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
        int target=3;
        arrprint(arr,n-1,target);
        
    }
    public static void arrprint(int [] arr,int n,int target)
    {
        if(n==-1)
        {
            return;
        }
        arrprint(arr, n-1, target);
        if(arr[n]==target)
            {
                System.out.print(n+" ,");
            }
    }
}