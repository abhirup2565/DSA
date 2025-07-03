import java.util.*;
public class DistEleWindow {
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
        
        for(int i: countDistinct(arr,4))
        {
            System.out.println(i);
        }

    }

    public static ArrayList<Integer> countDistinct(int arr[], int windowSize) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
       ArrayList<Integer> ans = new ArrayList<>();
        int start=0,end=0;
        
        while(end<arr.length)
        {
            map.put(arr[end],map.getOrDefault(arr[end],0)+1);
            
            if(end-start+1==windowSize)
            {
                ans.add(map.size());
                map.put(arr[start],map.get(arr[start])-1);
                
                if(map.get(arr[start])==0)
                {
                    map.remove(arr[start]);
                }
                start++;
            }
            
            end++;
            
        }
        return ans;
    }
}
