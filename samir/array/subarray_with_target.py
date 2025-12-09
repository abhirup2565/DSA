def count_subarrays_with_sum(nums, target_sum):
    prefix_sum_frequency = {}  # Stores how many times each prefix sum appears
    prefix_sum = 0
    count_of_valid_subarrays = 0

    # We add this so that a prefix sum equal to target_sum is counted
    prefix_sum_frequency[0] = 1  
    
    for num in nums:
        # Step 1: update running prefix sum
        prefix_sum += num

        # Step 2: check if there exists a previous prefix sum
        # such that: prefix_sum - previous_prefix_sum = target_sum
        needed_prefix = prefix_sum - target_sum

        # If such prefix exists, then all occurrences represent valid subarrays
        if needed_prefix in prefix_sum_frequency:
            count_of_valid_subarrays += prefix_sum_frequency[needed_prefix]

        # Step 3: store/update the frequency of the current prefix sum
        prefix_sum_frequency[prefix_sum] = prefix_sum_frequency.get(prefix_sum, 0) + 1

    return count_of_valid_subarrays


# ---- Driver code ----
arr = [3, 1, 2, 4]
k = 6
result = count_subarrays_with_sum(arr, k)
print("The number of subarrays with sum", k, "is:", result)
