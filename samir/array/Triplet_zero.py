def threeSum(arr, n):
        # Store unique triplets
        ans = set()

        # First loop for first element
        for i in range(n):
            # Set to store elements seen in this iteration
            hashset = set()

            # Second loop for second element
            for j in range(i + 1, n):
                # Calculate third element needed
                third = -(arr[i] + arr[j])

                # If third already in set, we found a triplet
                if third in hashset:
                    triplet = tuple(sorted([arr[i], arr[j], third]))
                    ans.add(triplet)

                # Add current element to set
                hashset.add(arr[j])

        # Convert set to list of lists
        return [list(triplet) for triplet in ans]

# Driver code
if __name__ == "__main__":
    arr = [-1, 0, 1, 2, -1, -4]
    n = len(arr)
    res = threeSum(arr, n)
    for triplet in res:
        print(triplet)