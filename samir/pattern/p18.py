def p18(n):
    for i in range(n):
        counter = ord('A')+n-1
        for j in range(i+1):
            print(chr(counter),end=" ")
            counter -= 1
        print("")

p18(5)