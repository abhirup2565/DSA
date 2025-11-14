def missingNumber(a, N):
    summation = (N * (N + 1)) // 2
    s2 = sum(a)

    missingNum = summation - s2
    return missingNum

def main():
    N = 5
    a = [1, 2, 4, 5]
    ans = missingNumber(a, N)
    print("The missing number is:", ans)

if __name__ == '__main__':
    main()