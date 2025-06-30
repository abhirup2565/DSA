import java.util.Scanner;
public class MaxSub {
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
        int max_sum =arr[0];
        int curr_sum=arr[0]; 
        int start = 0;
        int end = 0;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]>curr_sum+arr[i])
            {
                curr_sum=arr[i];
                
                if(curr_sum>max_sum)
                {
                    max_sum=curr_sum;
                    start=i;
                    end=i;
                }
            }
            else
            {
                curr_sum+=arr[i];
                if(curr_sum>max_sum)
                {
                    max_sum=curr_sum;
                    end=i;
                }
            }
        }
         System.out.println("Start "+start+" End "+end+" maximum value "+max_sum);
        }
 }
   


// O(n2) complexity
// int max=arr[0];
//         int start = 0;
//         int end = 0;
//         for (int i = 0; i<n;i++)
//         {
//             int sum = 0;
            
//             for(int j = i; j<n; j++)
//             {
//                 sum+=arr[j];
                
//                 if(sum>max)
//                 {
//                     max =sum;
//                     start = i;
//                     end=j;
//                 }
//             }
//         }
//         System.out.println("Start "+start+" End "+end+" maximum value "+max);