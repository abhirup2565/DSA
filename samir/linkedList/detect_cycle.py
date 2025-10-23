class Node:
    def __init__(self,value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

link = LinkedList()

def detect_cyle(link):
    tortoise = link.head
    hare = link.head

    while(hare is None or hare.next is None):
        tortoise = tortoise.next
        hare = hare.next.next 
        if hare == tortoise:
            return True #cycle detected
    return False #No cycle