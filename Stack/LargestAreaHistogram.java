import java.util.*;

class LargestAreaHistogram {
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
        //Function returns right bound of each element
        int [] rightBound = new int[n];
        rightBound=rightBound(arr);
        //Function returns left bound of each element
        int [] leftBound = new int[n];
        leftBound=leftBound(arr);
        //final answer
        int maxArea=0;
        for(int i=0;i<n;i++)
        {
            int width = rightBound[i]-leftBound[i]-1;
            int area = arr[i]*width;
            if(area>maxArea)
            {
                maxArea=area;
            }
        } 
        System.out.println(maxArea);
    }

    public static int[] rightBound(int[] arr)
    {
        //initializing variable
        int n = arr.length;
        int [] rb = new int[n];
        Stack<Integer> st= new Stack<>();
        //core logic
        rb[n-1]=n;
        st.push(n-1);
        for(int i= arr.length-2;i>0;i--)
        {
            while(st.size()>0 && arr[i]<arr[st.peek()]) {
                st.pop();
            }
            rb[i]=st.size()==0?arr.length:st.peek();
            st.push(i);
        }
        return rb;
    }
    public static int[] leftBound(int[] arr)
    {
        //initializing variable
        Stack<Integer> st= new Stack<>();
        int n = arr.length;
        int [] lb = new int[n];
        //core logic
        lb[0]=-1;
        st.push(0);
       
        for(int i= 1;i<n;i++)
        {
            while(st.size()>0 && arr[i]<arr[st.peek()]) {
                st.pop();
            }
            lb[i]=st.size()==0?-1:st.peek();
            st.push(i);
        }
        return lb;
    }
}
