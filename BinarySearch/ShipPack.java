import java.util.*;

public class ShipPack {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int min = Arrays.stream(nums).max().getAsInt();
        int max=0;
        for(int i:nums)
        {
            max+=i;
        }
        System.out.println(findCapacity(nums, days ,min, max));
    }

    public static int findCapacity(int[] nums,int days ,int low,int high) {
        
        int capacity = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ( midDays(nums, mid)<=days) {
                capacity = mid; 
                high = mid - 1; 
                
            } else {
                low = mid + 1;
            }
        }
        return capacity;
    }

    private static int midDays(int[] nums,int mid ) {
        int sum = 0;
        int midDay=1;
        for (int num : nums) {
            sum += num;  
            if(sum>mid)
            {
            midDay++;
            sum=num;
            }
        }
        return midDay;
    }
}