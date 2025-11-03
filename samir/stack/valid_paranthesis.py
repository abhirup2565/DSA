class MyStack:
    def __init__(self):
        self.stack=[]

    def push(self,value):
        self.stack.append(value)

    def pop(self):
        if not self.stack:
            return None
        return self.stack.pop()

    def peek(self):
        if not self.stack:
            raise ValueError("stack is empty")
        return self.stack[-1]
        

def paranthesis(input):
    pstack = MyStack()
    mapping = {')':'(','}':'{',']':'['}
    for c in input:
        if c == '(' or c == '{' or c == '[':
            pstack.push(c)
        elif c == ')' or c == '}' or c == ']':
            if not pstack.stack:
                return False
            if mapping[c] == pstack.peek():
                pstack.pop()
            else:
                return False
    if pstack.stack:
        return False
    return True

print(paranthesis("()"))
