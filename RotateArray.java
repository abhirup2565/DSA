import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values in array");
         for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Rotate element by");
        int k = sc.nextInt();

        k=k%n;
        if(k < 0)
        {
            k=k+n;
        }
        //rotating part 1 of array
        arr=reverse(arr,0,k);
        //rotating part 2 of array
        arr=reverse(arr,k+1,n);
        //rotating whole array
        arr=reverse(arr,0,n);
        for(int j:arr)
        {
            System.out.print(j);
        }


    }
    

 public static int[] reverse(int[]arr,int start,int end)
    {
        int temp=0;
        for(int i=start;i<end/2;i++)
        {
            temp =arr[i];
            arr[i]=arr[(end-1)-i];
            arr[(end-1)-i]=temp;
        }
        return arr;
    }
}