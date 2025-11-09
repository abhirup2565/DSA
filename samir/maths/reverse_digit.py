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
    N = 12345
    print("N:", N)
    digits = reverseDigits(N)
    print("Reverse of Digits in N:", digits)