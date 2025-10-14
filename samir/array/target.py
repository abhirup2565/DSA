# Input: nums = [2,7,11,15], target = 9
# Output: [0,1]
# Explanation: nums[0] + nums[1] = 2 + 7 = 9

def target_indices():
    """using two pointer approach"""
    nums = [2,7,11,15]
    target = 9

    end = len(nums)-1
    start = 0 

    while(start<end):
        if(nums[start]+nums[end]==target):
            break
        elif(target<nums[end]):
            end=end-1
        else:
            start=start+1

    if(start==end):
        print("No solution found")
    else:
        print("indices: [",start,"],[",end,"]")

target_indices()