import java.util.*;
public class Quick {
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
        
        int end = n-1;
        int start =0;
        
        sort(arr, start, end);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    
    }
    public static int partion(int[]arr,int start,int end)
    {
        int pivot=arr[start];
        int i = start+1;
        int j =end;
        int temp;
        while(i<=j)
        {
            while (i<=j && arr[i]<=pivot ) {
                i++;
            }
            while (i<=j && pivot<arr[j] ) {
                j--;
            }
            if(i<j)
            {
                temp =arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }  
        }
        
        arr[start] =arr[j];
        arr[j] = pivot;
        
        return j;
}

    public static void sort(int[]arr,int start,int end)
    {
        if(start<end)
        {
            int pivot=partion(arr, start,end);
            sort(arr,start,pivot-1);
            sort(arr,pivot+1,end);
        }
    }
}