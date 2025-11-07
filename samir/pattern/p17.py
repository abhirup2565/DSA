import math 
def p17(n:int):
    for i in range(n):
        counter = ord('A')
        for j in range(n-1-i):
            print(" ",end="")
        for k in range((2*i)-1):
            if k <= math.ceil(i/2):
                print(chr(counter),end="")
                counter+=1
            if k > math.ceil(i/2):
                if k == math.ceil(i/2)+1:
                    counter-=1
                counter-=1
                print(chr(counter),end="")
        print("")


p17(4)