import java.util.*;
public class NextGreatestElement2{
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
     /**interating from start storing in stack if larger exist ,meanwhile poping smaller value  */
        Stack<Integer> st = new Stack<>();
        int [] nge = new int[n];
        for(int i=0;i<n;i++)
        {
            while(st.size()>0 && arr[i]>arr[st.peek()])
            {
                nge[st.peek()]=arr[i];
                st.pop();
            }
            if(st.size()==0 || arr[i]<arr[st.peek()])
            {
                st.add(i);
            }
        }
        while(st.size()>0)
        {
            nge[st.peek()]=-1;
            st.pop();
        }
        //printing result
        for(int i=0;i<n;i++)
        {
            System.out.println(nge[i]);
        }  
    }
}
