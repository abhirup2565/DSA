import java.util.Scanner;
public class Maximum {
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
        for(int i:maxSlidingWindow(arr, k))
        {
            System.out.print(i+" ");
        }
        
    }




    public static int[] maxSlidingWindow(int[] arr, int k) {
        int [] ans = new int[arr.length-k+1];
        for(int i=0;i<=arr.length-k;i++)
        {
            int max =arr[i];
            for(int j=i;j<i+k;j++)
            {
                if(max<arr[j])
                {
                    max=arr[j];
                }
            }
            ans[i]=max;
        }
        return ans;
    }
}
