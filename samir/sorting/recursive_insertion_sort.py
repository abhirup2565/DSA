def insertion_sort_recursive(arr, n=None):
    if n is None:
        n = 1

    if n == len(arr):
        return
    
    j=n
    current = arr[j]
    while j>0 and arr[j-1]>current:
        arr[j]=arr[j-1]
        j = j-1
    arr[j] = current

    insertion_sort_recursive(arr, n+1)
    return arr


arr = [5, 1, 4, 2, 8]
print(insertion_sort_recursive(arr))