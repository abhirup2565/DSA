import java.util.Scanner;
public class AllOccur{
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
        int target=3;
        int fsf=0;
        
        int [] ans= arrprint(arr,n-1,target,fsf);
        for(int i:ans)
        {
            System.out.print(i);
        }
    }
    public static int[] arrprint(int [] arr,int n,int target,int fsf)
    {
        if(n==-1)
        {
            int [] pos =new int[fsf];
            return pos;
        }
        if(arr[n]==target)
        {
            fsf++;
        }
        int[] pos = arrprint(arr,n-1,target,fsf);
        if(arr[n]==target)
        {
            pos[fsf-1]=n;
            fsf--;
        }
        return pos;
    }
}