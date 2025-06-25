import java.util.Scanner;
public class findElement {
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
         System.out.println("Search for");
         int find = sc.nextInt();
    
         for(int i=0;i<n;i++)
         {
            if(find == arr[i])
            System.out.println("found element at index  "+i);
            break;
         }

    }
}