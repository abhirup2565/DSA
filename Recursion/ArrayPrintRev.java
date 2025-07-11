import java.util.Scanner;
public class ArrayPrintRev {
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
        // System.out.println("Enter the index number ");
        // int idx = sc.nextInt();

        arrprint(arr,n-1);
    }
    public static void arrprint(int [] arr,int n)
    {
        if(n==-1)
        {
            return;
        }
        System.out.println(arr[n]);
        arrprint(arr,n-1);
    }
}