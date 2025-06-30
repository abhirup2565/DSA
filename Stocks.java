import java.util.Scanner;
public class Stocks {
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
        int diff,profit=0;
        int min = arr[0];
            for(int i = 0 ; i<n-1;i++)
            {   
                if (min>arr[i])
                {
                    min=arr[i];
                }
                diff=arr[i]-min;
                if(diff>profit)
                {
                    profit = diff;
                }
            }
           System.out.println("final Profit is "+profit);
        }
 }
   


// O(n2) complexity
//               int max=0;
//             int start = 0;
//             int end = 0;
//             for (int i = 0; i<n;i++)
//             {
//                 int sum = 0;
                
//                 for(int j = i; j<n; j++)
//                 {
//                     sum+=arr[j]-arr[i];
                    
//                     if(sum>max)
//                     {
//                         max =sum;
//                         start = i;
//                         end=j;
//                     }
//                 }
//             }
//         System.out.println("Start "+start+" End "+end+" maximum value "+max);


//---------------using kadanes's algo O(n) time O(1) space------------------------
// int max_sum =0;
//         int curr_sum=0; 
//         int start = 0;
//         int end = 0;
        
//         for(int i=0;i<n-1;i++)
//         {
//             int diff= arr[i+1]-arr[i];
//             if(diff>curr_sum+arr[i])
//             {
//                 curr_sum=diff;
                
//                 if(curr_sum>max_sum)
//                 {
//                     max_sum=curr_sum;
//                     start=i;
//                     end=i;
//                 }
//             }
//             else
//             {
//                 curr_sum+=diff;
//                 if(curr_sum>max_sum)
//                 {
//                     max_sum=curr_sum;
//                     end=i+1;
//                 }
//             }
//         }