import java.util.Scanner;
public class CeilFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values in array");
         for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target value");
        int target = sc.nextInt();
        int ceil = -1;
        int floor = -1;
        int low = 0;
        int high = n-1;

        while(high>=low)
        {
            int mid = (low+high)/2;
            if(arr[mid]<target)
            {
                low = mid+1;
                floor = arr[mid];
                
            }
            else if(arr[mid]>target)
            {
                high = mid-1;
                ceil=arr[mid];
            }
            else
            {
                floor=arr[mid];
                ceil=arr[mid];
                break;
            }
            
        }
        System.out.println("Ceil: "+ceil+" Floor: "+floor);
    }
}
