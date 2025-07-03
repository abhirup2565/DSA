import java.util.*;
import java.util.Scanner;
public class DistEle {
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
        System.out.print(countDistinct(arr));

    }

    public static int countDistinct(int arr[]){
        Set <Integer> set = new HashSet<>();
        for(int ele: arr)
        {
            set.add(ele);
        }
        return set.size();
    }
}