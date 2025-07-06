import java.util.Scanner;
public class MooreAlgo {
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
        int ans = potentialAns(arr, n);
        ans=verifying(arr, n, ans);
        System.out.println("majority element is "+ans);



    }
    public static int potentialAns(int[]arr,int n)
    {
        
        int ans =arr[0];
        int freq=1;
        for(int i=1;i<n;i++)
        {
            freq=(ans==arr[i]?++freq:--freq);
            if(freq==0)
            {
            ans=arr[i];
            freq=1;
            }
        }
        return ans;
    }
    public static int verifying(int[]arr,int n,int ans)
    {
        
        int freq=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==ans)
            {
                freq++;
            }
        }
        if (freq>n/2)
        {
            return ans;
        }
        return -1;
    }
}
