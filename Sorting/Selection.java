import java.util.*;
public class Selection {
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
        int min = arr[0];
        for(int i=0;i<n-1;i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp;
                temp =arr[min];
                arr[min] = arr[i];
                arr[i]=temp;
            }
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    
    }
}