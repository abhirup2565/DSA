import java.util.*;
public class NextGreatestElement {
    public static void main(String[] args) {
        
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }  
        //execting code
        nge(n, arr); 
    }
    public static void nge(int n,int[]arr)
    {
     /**interating from the end and adding in stack if smaller than peek or stack is empty */
        Stack<Integer> st = new Stack<>();
        int [] nge = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(st.size()!=0 && arr[i]>st.peek())
            {
                st.pop();
            }
            if(st.size()==0)
            {
                nge[i]=-1;
            }
            else
            {
                nge[i]=st.peek();
            }
            st.add(arr[i]);
        }
        //printing result
        for(int i=0;i<n;i++)
        {
            System.out.println(nge[i]);
        }  
    }
}
