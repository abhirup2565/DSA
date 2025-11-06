def p14(n):
    counter = ord('A')
    for i in range(n):
        for j in range(i+1):
            print(chr(counter),end=" ")
            counter += 1
        print("")

p14(5)