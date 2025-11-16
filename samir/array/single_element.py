def getSingleElement(arr):
    # XOR all the elements:
    xorr = 0
    for num in arr:
        xorr ^= num
    return xorr

arr = [4, 1, 2, 1, 2]
ans = getSingleElement(arr)
print("The single element is:", ans)