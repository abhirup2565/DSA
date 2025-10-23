class Node:
    def __init__(self,value:int):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

link = LinkedList()

def reverse(current, previous = None):
    if current is None:
        return previous
    next_node = current.next
    current.next = previous
    return reverse(next_node, current)
          

# Example usage:
link = LinkedList()
link.head = Node(1)
link.head.next = Node(2)
link.head.next.next = Node(3)
link.head = reverse(link.head)

# Print reversed list
temp = link.head
while temp:
    print(temp.value, end=" -> ")
    temp = temp.next