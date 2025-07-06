import java.util.Scanner;
public class FirstLast {
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
        System.out.println("Enter Target value");
        int target = sc.nextInt();
        int first = -1;
        int last = -1;
        int low = 0;
        int high = n-1;

        //for first occurence
        int fhigh=high;
        int flow=low;
        while(fhigh>=flow)
        {
            int mid = (flow+fhigh)/2;
            if(arr[mid]<target)
            {
                flow = mid+1;
                
            }
            else if(arr[mid]>target)
            {
                fhigh = mid-1;
            }
            else
            {
                first=mid;
                fhigh = mid-1;
            }
            
        }

        //for last occurence
        int lhigh=high;
        int llow=low;
        while(lhigh>=llow)
        {
            int mid = (llow+lhigh)/2;
            if(arr[mid]<target)
            {
                llow = mid+1;
                
            }
            else if(arr[mid]>target)
            {
                lhigh = mid-1;
            }
            else
            {
                last=mid;
                llow = mid+1;
            }
            
        }
        System.out.println("First: "+first+" Last: "+last);
    }
}
