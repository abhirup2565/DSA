def moveZeroes(nums):
    j = -1

    for i in range(len(nums)):
        if nums[i] == 0:
            j = i
            break

    if j == -1:
        return

    # Start from the next index of first zero
    for i in range(j + 1, len(nums)):
        # If current element is non-zero
        if nums[i] != 0:
            # Swap with nums[j]
            nums[i], nums[j] = nums[j], nums[i]
            # Move j to next zero
            j += 1

    return nums

# Driver code
nums = [0, 1, 0, 3, 12]
print(moveZeroes(nums))

