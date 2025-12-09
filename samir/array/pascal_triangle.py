
# Function to compute binomial coefficient (nCr)
def findPascalElement(r, c):
    # Element is C(r-1, c-1)
    n = r - 1
    k = c - 1

    result = 1

    # Compute C(n, k) using iterative formula
    for i in range(k):
        result *= (n - i)
        result //= (i + 1)

    return result


# Main code to test the solution
if __name__ == "__main__":
    r, c = 1, 1
    print(findPascalElement(r, c))