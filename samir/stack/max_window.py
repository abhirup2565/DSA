from collections import deque

def max_sliding_window(nums, k):
    dq = deque()  
    res = []
    low = 0
    high = 0
    max = 0

    while(high<len(nums)):
        current = nums[high]
        while(dq and dq[-1]<current):
            dq.pop()
        dq.append(current)

        if(high-low == k-1):
            res.append(dq[0])
            if dq[0]==nums[low]:
                dq.popleft()
            low = low+1    
        high = high+1    

    return res

nums = [1,3,-1,-3,5,3,6,7]
k = 3
print(max_sliding_window(nums,k))
