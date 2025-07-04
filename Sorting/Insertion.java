import java.util.*;
public class Insertion {
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
        int temp;
        for(int i=1;i<n;i++)
        {
            temp=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    
    }
}