class Node:
    def __init__(self, value: int):
        self.value = value
        self.next = None


def add_two_numbers(l1: Node, l2: Node) -> Node:
    dummy = Node(0)
    current = dummy
    carry = 0

    while l1 or l2 or carry:
        val1 = l1.value if l1 else 0
        val2 = l2.value if l2 else 0

        total = val1 + val2 + carry
        carry = total // 10
        new_digit = total % 10

        current.next = Node(new_digit)
        current = current.next

        if l1:
            l1 = l1.next
        if l2:
            l2 = l2.next

    return dummy.next
