import java.util.*;
import java.util.Scanner;
public class UnionArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.println("Enter values in array");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        

        //2nd array
        System.out.println("Enter size of array ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter values in array");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        
        //union of two array
        Set <Integer> set = new HashSet<>();
        union(arr1,set);
        union(arr2,set);

        //print set
        for(int i: set)
        {
            System.out.print(i+" ,");
        }
    }

    public static void union(int arr[],Set<Integer> set){
        for(int ele: arr)
        {
            set.add(ele);
        }
    }
}
