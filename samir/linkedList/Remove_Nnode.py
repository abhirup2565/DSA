class Node:
    def __init__(self,value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

link_1 = LinkedList()

def remove(head,back):
    new_head = head
    while(head.next):
        if head.next is back:
            head.next = head.next.next
        head = head.next
    return new_head


def remove_nth(head,n):
    """
    create two pointer and maintain distance of n
    when the pointer in front reaches end remove the node in back
    edge case :
        n greate than size
        n is neagive number
    n=2->4
    og   1 2 3 4 5 6
    Du 0 1 2 3 4 5 6

    """

    Dummy = Node(0)
    Dummy.next = head
    front = Dummy
    back = Dummy

    for _ in range(n+1):
        if front is None:
            return head
        front = front.next

    while front:
        front = front.next
        back = back.next

    back.next = back.next.next

    return Dummy.next

        
    