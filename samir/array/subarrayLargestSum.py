def subarrayLargestSum():
    nums = [-2,1,-3,4,-1,2,1,-5,4]
    
    max_sum = nums[0]
    current_sum = nums[0]
    
    for i in range(1, len(nums)):
        # Take max of: start new subarray OR extend current one
        current_sum = max(nums[i], current_sum + nums[i])
        max_sum = max(max_sum, current_sum)
    
    print(max_sum)
    return max_sum

subarrayLargestSum()