import java.util.*;

class StockSpan {
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
        //Function returns string of stock span
        int [] ans = new int[n];
        ans=span(arr);
        //printing answer
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+", ");
        } 
    }

    public static int[] span(int[] arr)
    {
        //initializing variable
        int n = arr.length;
        int [] spans = new int[n];
        Stack<Integer> st= new Stack<>();
        //core logic
        for(int i= 0;i<n;i++)
        {
            while(st.size()>0 && arr[i]>arr[st.peek()]) {
                st.pop();
            }
            spans[i]=st.size()==0?i+1:i-st.peek();
            st.add(i);
        }
        return spans;
    }
}
