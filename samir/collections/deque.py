from collections import deque

dq = deque([1, 2, 3])
dq.append(4)       # add to right
dq.appendleft(0)   # add to left
print(dq)          # deque([0, 1, 2, 3, 4])

dq.pop()           # remove from right
dq.popleft()       # remove from left
print(dq)          # deque([1, 2, 3])

dq = deque([1, 2, 3, 4])
dq.rotate(1)
print(dq)  # deque([4, 1, 2, 3])
