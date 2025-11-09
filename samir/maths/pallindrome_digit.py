import math

def reverseDigits(n):
    rev = 0
    while(n>0):
        current_digit = n%10
        rev = (rev*10)+current_digit
        n = math.floor(n/10)
    return rev

# Main function
if __name__ == "__main__":
    N = 111
    print("N:", N)
    rev_digits = reverseDigits(N)
    if(rev_digits==N):
        print(True)
    else:
        print(False)