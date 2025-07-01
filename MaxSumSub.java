import java.util.Scanner;
public class MaxSumSub {
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
        System.out.println("Enter value of k ");
        int k = sc.nextInt();
        System.out.println(maximumSumSubarray(arr, k));
    }
public static int maximumSumSubarray(int[] arr, int k) {
        // Code here
       int max = 0;
        for(int i=0;i<=arr.length-k;i++)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum+=arr[j];
            }
            if(max<sum)
            {
                max=sum;
            }
        }
        return max;
    }


}








