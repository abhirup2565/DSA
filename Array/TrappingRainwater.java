import java.util.Scanner;
public class TrappingRainwater {
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
        int mid=0;
        for(int i=0;i<n;i++)
        {
            if(arr[mid]<arr[i])
            {
                mid = i;
            }
        }
        System.out.println(mid+" value is "+arr[mid]);

        int max_arr[] = new int[n];
        int rainTrapped=0;
        int left=0;
        int right=n-1;
        int rmax=arr[n-1];
        int lmax =arr[0];
        max_arr[mid]=arr[mid];
        while(left<mid||right>mid)
        {
            if(left<mid)
            {
                if(lmax<arr[left])
                {
                    lmax=arr[left];
                }
                max_arr[left]=lmax;
            }

            if(right>mid)
            {
                if(rmax<arr[right])
                {
                    rmax=arr[right];
                }
                max_arr[right]=rmax;
            }
            right--;
            left++;
        }
        for(int i=0;i<n;i++)
        {
            max_arr[i]=max_arr[i]-arr[i];
        }
        for(int k:max_arr)
        {
            rainTrapped+=k;
        }
        System.out.println(rainTrapped);
        }
    }
