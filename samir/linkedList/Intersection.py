class Node:
    def __init__(self,value:int):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

link1 = LinkedList()
link2 = LinkedList()

def traversal(link1, link2):
    visited = set()
    # Traverse first list
    while link1:
        visited.add(link1)     # store node reference, not value
        link1 = link1.next
    # Traverse second list
    while link2:
        if link2 in visited:   # check by node identity
            return True        # intersection found
        link2 = link2.next
    return False

def get_intersection_node(headA, headB): 
    if not headA or not headB: 
        return None 
    a, b = headA, headB # Traverse both lists; when one ends, switch to the other’s head 
    while a != b: 
        a = a.next if a else headB 
        b = b.next if b else headA 
    
    return a # Either intersection node or None

