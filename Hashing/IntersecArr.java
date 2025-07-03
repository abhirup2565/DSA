import java.util.*;

public class IntersecArr {
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
        int counter=0;
        Set <Integer> set = new HashSet<>();

        System.out.print(inter(arr1,arr2,counter,set));
    }

    public static int inter(int arr1[],int arr2[],int counter,Set<Integer> set){
        for(int ele: arr1)
        {
            set.add(ele);
        }
        for(int ele: arr2)
        {
            if(set.contains(ele))
            {
                counter++;
                set.remove(ele);
            }
        }
        return counter;
    }
}


