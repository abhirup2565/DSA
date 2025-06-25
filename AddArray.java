import java.util.Scanner;
public class AddArray {
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
        System.out.println("Enter size of array 2");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter values in array");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }

        int add[] = new int[n1 > n2? n1:n2];
        int c =0;

        int i =arr1.length-1;
        int j = arr2.length-1;
        int k = add.length-1;
        
        while(k >= 0)
        {
            int d =c;
            if(i>=0)
            {
                d+=arr1[i];
            }

            if(j>=0)
            {
                d+=arr2[j];
            }

            c= d/10;
            d= d%10;

            add[k]=d;

            i--;
            j--;
            k--;
        }
        if(c!=0)
        {
            System.out.println(c);
        }
        for(int val : add)
        {
            System.out.println(val);
        }
    }
}