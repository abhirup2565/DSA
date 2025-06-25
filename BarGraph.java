import java.util.Scanner;
public class BarGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

//finding max element
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }

        //  new value of array
        for(int j=0;j<max;j++)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]-max>=0)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
                arr[i]++;
            }
            System.out.println();
        }
    }
}
