def p2(n):
    for i in range(n):
        for j in range(i+1):
            print("*",end="")
        print("")

def p5(n):
    for i in range(n):
        for j in range(n-i):
            print("*",end="")
        print("")

def p10(n=5):
    p2(n)
    p5(n-1)

p10()