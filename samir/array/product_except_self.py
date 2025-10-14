def productExceptSelf():
    '''
    The key insight is to calculate the product of all elements to the left of each index, and the product of all elements to the right of each index, then multiply them together.
    '''
    nums = [1,2,3,4]
    n = len(nums)
    ans = [1]*n

    left_product = 1
    for i in range(n):
        ans[i] = left_product
        left_product = left_product*nums[i]

    right_product = 1
    for i in range(n - 1, -1, -1):
        ans[i] = right_product
        right_product = right_product*nums[i]

    print(ans)

productExceptSelf()