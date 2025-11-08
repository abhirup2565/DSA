def p20(n):
    for i in range(1,2*n,1):
        if (i == 5):
            for j in range(2*i):
                print("*",end="")
            print()
        if(i<n):
            for j in range(i%n):
                print("*",end="")
            for k in range((n-i)*2):
                print(" ",end="")
            for j in range(i%n):
                print("*",end="")
            print()
        if(i>n):
            for j in range(2*n-i):
                print("*",end="")
            for k in range((i%n)*2):
                print(" ",end="")
            for j in range(2*n-i):
                print("*",end="")
            print()

p20(5)