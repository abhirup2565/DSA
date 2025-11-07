def p19(n):
    for i in range (2*n):
        if (i == 0) or i==((2*n)-1):
            for j in range(2*n):
                print("*",end="")
            print(" ")
            continue
        if(i<n):
            for j in range(n-i):
                print("*",end="")

            for k in range(2*i):
                print(" ",end="")

            for j in range(n-i):
                print("*",end="")
        else:
            un = i%n
            for j in range(un+1):
                print("*",end="")

            for k in range((n-1-un)*2):
                print(" ",end="")

            for j in range(un+1):
                print("*",end="")
            
        print(" ")
p19(5)
