import math

def getDivisors(N):
    res = []
    # Loop from 1 to square root of N
    for i in range(1, int(math.isqrt(N)) + 1):
        if N % i == 0:
            res.append(i)
            if i != N // i:
                res.append(N // i)
    return res

# Input number
if __name__ == "__main__":
    N = 36
    result = getDivisors(N)
    print("Divisors of", N, ":", result)