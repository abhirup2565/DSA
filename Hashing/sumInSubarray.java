import java.util.*;
public class sumInSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sum ");
        int sum = sc.nextInt();
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        algo(arr,sum);
       

    }

    public static void algo(int arr[], int sum) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        int start=-1,end=-1;
        int current_sum =0;
        
        for(int i=0;i<arr.length;i++)
        {
            current_sum=current_sum+arr[i];

            if(current_sum==sum)
            {
                start=0;
                end=i;
                break;
            }
            else if (map.containsKey(current_sum-sum))
            {
                start=map.get(current_sum-sum)+1;
                end=i;
                break;
            }

            map.put(current_sum, i);
        }

        if(end==-1)
        {
            
            System.out.println("not found ");
        }
        else
        {
            System.out.println("start "+start+" end "+end);
        }
    }
}
