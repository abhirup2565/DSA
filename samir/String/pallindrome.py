n = "name"

def is_palindrome(n):
    low = 0
    high = len(n)-1
    
    while(low<high):
        if n[low] != n[high]:
            return False
        low+=1
        high-=1
    return True

print(is_palindrome(n))