def temp():
    temp_per_day = [73,74,75,71,69,72,76,73]
    stack = []
    next_warm = [0]*len(temp_per_day)
    i = len(temp_per_day)-1
    while(i>=0):
        current_temp = temp_per_day[i]
        if stack:
            while(stack and current_temp>temp_per_day[stack[-1]]):
                stack.pop()

        if not stack:
            next_warm[i] = 0  
        else:
            next_warm[i] = stack[-1]-i

        stack.append(i)
        i=i-1

    return next_warm

print(temp())
