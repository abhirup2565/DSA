def printLeaders(arr, n):
    ans = []
  
    max_elem = arr[n - 1]
    ans.append(arr[n - 1])

    for i in range(n - 2, -1, -1):
        if arr[i] > max_elem:
            ans.append(arr[i])
            max_elem = arr[i]

    return ans

# Main function
if __name__ == '__main__':
    n = 6
    arr = [10, 22, 12, 3, 0, 6]
    ans = printLeaders(arr, n)

    for i in range(len(ans)-1, -1, -1):
        print(ans[i], end=" ")

    print()