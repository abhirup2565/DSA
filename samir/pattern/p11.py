def p11(n):
    flag = True
    for i in range(n):
        for j in range(i+1):
            if flag:
                print("1",end="")
            else:
                print("0",end="")
            flag = not flag 
        print("")

p11(5)