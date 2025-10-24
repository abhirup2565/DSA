class Node:
    def __init__(self, value: int):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None


def get_kth_node(start, k):
    """Return the kth node from 'start' or None if not enough nodes."""
    curr = start
    for _ in range(k):
        if not curr:
            return None
        curr = curr.next
    return curr

def reverse_segment(start, end):
    """
    Reverse nodes starting from 'start' up to (but not including) 'end'.
    Return new head of reversed segment.
    """
    prev = end
    curr = start
    while curr != end:
        temp = curr.next
        curr.next = prev
        prev = curr
        curr = temp
    return prev  # new head of reversed section

def reverse_k_group(head, k):
    if k <= 1 or not head:
        return head

    dummy = Node(0)
    dummy.next = head
    group_prev = dummy

    while True:
        kth = get_kth_node(group_prev, k)
        if not kth:
            break  # not enough nodes left to reverse
        group_next = kth.next

        # Reverse the group
        new_group_head = reverse_segment(group_prev.next, group_next)

        # Connect with previous part
        temp = group_prev.next  # This becomes the end of the reversed group
        group_prev.next = new_group_head
        group_prev = temp

    return dummy.next
