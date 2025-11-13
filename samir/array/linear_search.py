def linear(arr,target):
    for idx,i in enumerate(arr):
        if i == target:
            return idx

nums = [1, 2, 3, 4, 5]
print(linear(nums,3))