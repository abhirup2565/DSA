import java.util.*;

public class SmallestDivisor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println(findSmallestDivisor(nums, threshold));  // Expected output: 5
    }

    public static int findSmallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();  // max element in the array
        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (computeSum(nums, mid) <= threshold) {
                answer = mid;  // possible answer, try to minimize
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    private static int computeSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;  // ceiling division without using floating-point
        }
        return sum;
    }
}