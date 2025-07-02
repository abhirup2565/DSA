import java.util.*;
import java.util.Scanner;
public class Maximum {
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
        System.out.println("Enter value of k ");
        int k = sc.nextInt();
        for(int i:maxSlidingWindow(arr, k))
        {
            System.out.print(i+" ");
        }
        
    }




    public static int[] maxSlidingWindow(int[] arr, int k) {
        int [] ans = new int[arr.length-k+1];
        int start=0,end=0,max=arr[0],windowSize=k;
        Deque<Integer> temp = new ArrayDeque<>();
        
        while (end<arr.length) {
            if(temp.size()==0||arr[end]<=temp.peekFirst())
            {
                temp.addFirst(arr[end]);
            }
            else {
                while(temp.size()!=0 && arr[end]>temp.peekFirst())
                {
                temp.removeFirst();
                }
                temp.addFirst(arr[end]);
            }
            
            if(end-start+1==windowSize)
            {
                max=temp.peekLast();
                ans[start]=max;

                if(arr[start]==max)
                {
                    temp.removeLast();
                }
                start++;
            }
            end++;
        }
        return ans;
    }
}
