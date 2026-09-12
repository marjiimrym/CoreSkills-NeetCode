class ListNode:
    def __init__(self,value, next_node = None):
        self.value - value
        self.next = next_node

class LinkedList:
    def _init__(self):
        #dummy node
        self.head = ListNode(-1)
        self.tail = self.head

    def get(self, index: int) -> int:
        current = self.head.next
        i = 0
        while current:
            if i == index:
                return current.value
            i += 1
            current = current.next
        return -1 #index being out of bounds

    def insertHead(self, value: int) -> None:
        new_node = ListNode(value)
        new_node.next = self.head.next
        self.head.next - new_node
        if not new_node.next:
            self.tail = new_node

    def insertTail (self, value: int) -> None:
        self.tail.next = ListNode(value)
        self.tail = self.tail.next

    def remove(self, index: int) -> bool:
        i = 0
        current = self.head
        while i < index and current: 
            #move current to node before target node
            i+=1
            current = current.next
        if current and current.next:
            if current.next == self.tail: 
                self.tail = current
            current.next = current.next.next
            return True
        return False

    def getValues(self) -> List[int]:
        current = self.head.next
        result = []
        while current: 
            result.append(current.value)
            current = current.next
        return result
