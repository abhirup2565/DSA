import java.util.Scanner;
public class TrappingRainwater {
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
        int mid=0;
        for(int i=0;i<n;i++)
        {
            if(arr[mid]<arr[i])
            {
                mid = i;
            }
        }
        System.out.println(mid+" value is "+arr[mid]);
        }
    }
