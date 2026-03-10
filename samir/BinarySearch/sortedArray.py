#recursive approach
class Solution:
    # Recursive Binary Search function
    def binarySearch(self, nums, low, high, target):
        if low > high:
            return -1  # Base case: target not found

        # Find middle index
        mid = (low + high) // 2

        # If target is found at mid
        if nums[mid] == target:
            return mid
        # If target is greater, search right half
        elif target > nums[mid]:
            return self.binarySearch(nums, mid + 1, high, target)
        # Otherwise, search left half
        return self.binarySearch(nums, low, mid - 1, target)

    # Public function to initiate search
    def search(self, nums, target):
        return self.binarySearch(nums, 0, len(nums) - 1, target)


if __name__ == "__main__":
    a = [3, 4, 6, 7, 9, 12, 16, 17]  # sorted list
    target = 6  # target element to search

    obj = Solution()  # Create object of Solution class
    ind = obj.search(a, target)

    if ind == -1:
        print("The target is not present.")
    else:
        print("The target is at index:", ind)