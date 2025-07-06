import java.util.*;
public class Merge{
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
        
        mergeSort(arr, start, end);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    
    }
    public static void merge(int[]arr,int start,int mid,int end)
    {
        int i = start;
        int j =mid+1;
        int k=start;
        int [] b = new int[arr.length];
        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
                b[k]=arr[i];
                i++;
            } 
            else
            {
                b[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>mid)
        {
            while(j<=end)
            {
                b[k]=arr[j];
                k++;
                j++;
            }
        }
        else
        {
            while(i<=mid)
            {
                b[k]=arr[i];
                k++;
                i++;
            }
        }
        for(int x=start;x<=end;x++)
        {
            arr[x]=b[x];
        }
}

    public static void mergeSort(int[]arr,int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr,start,mid,end);
        }
    }
}