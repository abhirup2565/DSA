import java.util.Scanner;
public class FirstOccur{
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
        int target=8;
        System.out.println(arrprint(arr,n-1,target));
        
    }
    public static int arrprint(int [] arr,int n,int target)
    {
        if(n==-1)
        {
            return -1;
        }
        int pos=arrprint(arr, n-1, target);
        if(pos==-1)
        {
            if(arr[n]==target)
            {
                pos=n;
            }
        }
        return pos;
    }
}