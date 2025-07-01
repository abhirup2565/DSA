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
       int windowSum=0;
        int sum = 0;
      for(int i=0;i<k;i++)
      {
          windowSum+=arr[i];
          sum= windowSum;
      }
      int start=1;
      while(start<=arr.length-k)
      {
          windowSum+= arr[start+k-1] - arr[start-1];
          if (sum<windowSum)
          {
              sum=windowSum;
          }
          start++;
      }
      return sum;
    }


}



 

 // O(n^2)
    //    int max = 0;
    //     for(int i=0;i<=arr.length-k;i++)
    //     {
    //         int sum=0;
    //         for(int j=i;j<i+k;j++)
    //         {
    //             sum+=arr[j];
    //         }
    //         if(max<sum)
    //         {
    //             max=sum;
    //         }
    //     }
    //     return max;


