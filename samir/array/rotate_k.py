def rotate_by_k(arr, k):
    if k==0:
        return arr
    if k<0: 
        k = len(arr)+k
    left = rotate(arr[0:len(arr)-k])
    right = rotate(arr[len(arr)-k:])
    return rotate(right+left)

def rotate(arr):
    start = 0
    end = 0
    while(start<end):
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start = start+1
        end = end-1
    return arr

k = 3
arr = [1, 2, 3, 4, 5, 6, 7]
print(rotate_by_k(arr, k))