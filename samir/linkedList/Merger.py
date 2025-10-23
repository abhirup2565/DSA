class Node:
    def __init__(self,value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

link_1 = LinkedList()
link_2 = LinkedList()

"""
Assmuptions 
1. sorted
2. no cycle 

create a new linklist
pointer 1st elemet of both and add accoridinly
if one is of them reaches none then rest can be copied
"""

def merge_sorted_lists(head1, head2):
    dummy = Node(0)
    tail = dummy

    while head1 and head2:
        if head1.value < head2.value:
            tail.next = head1
            head1 = head1.next
        else:
            tail.next = head2
            head2 = head2.next
        tail = tail.next

    # Attach the remaining part
    if head1:
        tail.next = head1
    elif head2:
        tail.next = head2

    return dummy.next