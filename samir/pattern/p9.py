def p7(n):
    for i in range(5):
        for j in range((n-i)-1):
            print("",end=" ")
        for k in range((2*i)+1):
            print("*",end="")
        print(" ")

def p8(n):
    for i in range(n,0,-1):
        for j in range((n-i)):
            print(" ",end="")
        for k in range((2*i)-1):
            print("*",end="") 
        print("")

def p9(n=5):
    p7(5)
    p8(5)

p9()