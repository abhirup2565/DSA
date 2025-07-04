import java.util.*;
public class bubble {
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
        boolean swapped;
        for(int i=0;i<n;i++)
        {
            swapped = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    swapped=true;
                     int temp;
                    temp =arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
                if(!swapped)
                {
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }

    }

    
}