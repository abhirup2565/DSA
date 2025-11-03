class MyQueue:
    def __init__(self):
        self.stack1 = []  # for pushing new elements
        self.stack2 = []  # for popping in FIFO order

    def push(self, x: int):
        self.stack1.append(x)

    def pop(self):
        # If stack2 is empty, move all elements from stack1 to stack2
        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())
        return self.stack2.pop()

    def peek(self):
        # Front element (without removing)
        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())
        return self.stack2[-1]

    def empty(self):
        return not self.stack1 and not self.stack2

# Example
queue = MyQueue()
queue.push(1)
queue.push(2)
queue.push(3)
print(queue.pop())  # Output: 1
print(queue.pop())  # Output: 2
print(queue.peek()) # Output: 3
print(queue.empty()) # Output: False
