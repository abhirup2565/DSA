import java.util.*;

public class Solution {
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
        for(int i:firstNegInt(arr, k))
        {
            System.out.print(i);
        }
    }



    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> new_arr = new ArrayList<Integer>();
        
        for(int i = 0 ; i<k;i++)
        {
            if(arr[i]<0)
            {
                new_arr.add(arr[i]);
            }
            else
            {
                new_arr.add(0);
            }
        }
        int i =1;
        while(i<=arr.length-k)
        {
            if(arr[i+1]<0)
            {
                if(new_arr.get(i)>0)
                {
                    new_arr.set(i,arr[i+1]);
                }
                new_arr.add(arr[i+1]);
            }
            else
            {
                new_arr.add(0);
            }
            
            i++;
        }
        return new_arr;
    }
} 
