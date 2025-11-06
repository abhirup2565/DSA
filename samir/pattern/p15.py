def p15(n):
    for i in range(n,0,-1):
        counter = ord('A')
        for j in range(i):
            print(chr(counter),end=" ")
            counter += 1
        print("")

p15(5)