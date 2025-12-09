# Function to count subarrays with XOR equal to B
def countSubarraysXOR(A, B):
    # Initialize count of valid subarrays
    count = 0
    # Traverse all starting points
    for i in range(len(A)):
        # Maintain xor of current subarray
        xorVal = 0
        # Extend subarray till end
        for j in range(i, len(A)):
            # Update xor
            xorVal ^= A[j]
            # If xor equals B, increment count
            if xorVal == B:
                count += 1
    return count


def main():
    # Input array
    A = [4, 2, 2, 6, 4]
    # Target xor
    B = 6

    print(countSubarraysXOR(A, B))


if __name__ == "__main__":
    main()