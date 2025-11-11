def merge(arr1,arr2):
    arr=[]
    i=0
    j=0
    while i<len(arr1) and j<len(arr2):
        if arr1[i]<arr2[j]:
            arr.append(arr1[i])
            i=i+1
        else:
            arr.append(arr2[j])
            j=j+1
    if j < len(arr2):
        while j<len(arr2):
            arr.append(arr2[j])
            j=j+1

    
    if i < len(arr1):
        while i<len(arr1):
            arr.append(arr1[i])
            i= i+1
    return arr

def merge_sort(arr):
    n = len(arr) 
    if n<2:
        return arr
    mid = int(n/2)
    left = merge_sort(arr[0:mid])
    right = merge_sort(arr[mid:])
    return merge(left,right)

arr = [7, 5, 9, 2, 8]
print(merge_sort(arr))
