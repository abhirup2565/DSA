import java.util.Scanner;
public class SubArray {
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
        if(n1>n2)
        {
            add=sub(arr1,arr2,add);
        }
        else
        {
            add=sub(arr2,arr1,add);
        }
        
        for(int k: add)
        {
            System.out.print(k);
        }
        
    }
    public static int[] sub(int arr1[],int arr2[],int add[])//assuming n1 >n2
    {
        int n1=arr1.length-1;
        int n2=arr2.length-1;
        int na = add.length-1;

        int carry = 0;

        while(n1>=0||carry==0)
        {
            if(n1>=0)
            {
                add[na]+=arr1[n1]-carry;
                System.out.println("carry"+carry+"arr1[]"+arr1[n1]+"add:"+add[na]);
            }
            if(n2>=0)
            {
                add[na]=add[na]-arr2[n2];
                System.out.println("carry"+carry+"arr2[]"+arr2[n2]+"add:"+add[na]);
            } 
            if(na>=0 && add[na]<0)
            {
                add[na]+=10;
                carry = 1;
                System.out.println("carry"+carry);
            }
            
            
            na--;
            n2--;
            n1--;
        }
        return add;
    }



}
    


