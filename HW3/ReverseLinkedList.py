class Node:
    def __init__(self, value, next):
        self.value = value
        self.next = next

# метод печати заданного связанного списка
def print_list(head):
    ptr = head
    while ptr is not None:
        print(ptr.value, end=' —> ')
        ptr = ptr.next
    print('None')

# метод разворота связанного списка
def reverse_list(head, tail=None):
    while head:
        head.next, tail, head = tail, head, head.next
    return tail

def main():
    # создание односвязанного списка
    head = Node(3, Node(5, Node(8, Node(10, None))))
    # смотрим на созданный связанный список
    print_list(head)
    # смотрим на развернутый связанный список
    print_list(reverse_list(head))

main()