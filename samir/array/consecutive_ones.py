def findMaxConsecutiveOnes(self, nums):
    cnt = 0
    maxi = 0
    for i in range(len(nums)):
        if nums[i] == 1:
            cnt += 1
        else:
            cnt = 0
        maxi = max(maxi, cnt)
    return maxi




if __name__ == "__main__":
    nums = [1, 1, 0, 1, 1, 1]
    ans = findMaxConsecutiveOnes(nums)
    print("The maximum  consecutive 1's are", ans)