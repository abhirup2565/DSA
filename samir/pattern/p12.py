def p12(n):
    for i in range(n):
        for j in range(i+1):
            print(j+1,end="")
        for k in range((n-(i+1))*2):
            print(" ",end="")
        for j in range(i,-1,-1):
            print(j+1,end="")
        print("")

p12(4)