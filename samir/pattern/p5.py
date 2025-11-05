def p5(n):
    for i in range(n):
        for j in range(n-i):
            print("*",end="")
        print("")

p5(5)