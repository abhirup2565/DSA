class Node:
    def __init__(self,value:int):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

link = LinkedList()
          
def reverse_iterative(head):
    previous = None
    current = head
    while current:
        next_node = current.next     
        current.next = previous       
        previous = current           
        current = next_node          
    return previous   

def middle(head):
    back = head
    front = head
    while(front and front.next):
        back = back.next
        front = front.next.next  
    return back

def compare(list1,list2):
    while(list1 and list2):
        if list1.value != list2.value:
            return False
        list1 = list1.next
        list2= list2.next
    return True

def palindrome(head):
    mid = middle(head)
    rev = reverse_iterative(mid)
    return compare(head,rev)

# head = Node(1)
# head.next = Node(2)
# head.next.next = Node(3)
# head.next.next.next = Node(2)
# head.next.next.next.next = Node(1)

# print(palindrome(head)) 