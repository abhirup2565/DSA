import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter values in array");
         for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int k:reverse(arr1,n1))
        {
            System.out.print(k);
        }

    }
    public static int[] reverse(int[]arr,int n1)
    {
        int temp=0;
        for(int i=0;i<n1/2;i++)
        {
            temp =arr[i];
            arr[i]=arr[(n1-1)-i];
            arr[(n1-1)-i]=temp;
        }
        return arr;
    }
}
