class DynamicArray:
    #initalize dynamic array with specific capacity and sets list with zeros.
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.size = 0
        self.arr = [0]*capacity

    #retrieves and retusn element at i
    def get(self, i: int) -> int:
        return self.arr[i]

    #updates element at i to new value n
    def set(self, i: int, n: int) -> None:
        self.arr[i] = n
    
    #adds the element n to the end of array
    def pushback(self, n: int) -> None: 
        if self.size == self.capacity: 
            self.resize()

        #this happens regardless of if we resized or not
        self.arr[self.size] = n
        self.size += 1

    #removes last element from the array by decreasing the size by 1. 
    def popback(self) -> int: 
        self.size -= 1
        return self.arr[self.size]
    
    #doubles the array's capacity by allocating the new list and copying exisiting elements.
    def resize(self) -> None:
        self.capacity *= 2
        new_arr = [0]*self.capacity
        for i in range(self.size):
            new_arr[i] = self.arr[i]
        self.arr = new_arr

    #returns the actual number of elements stores in array
    def getSize(self) -> int:
        return self.size
    
    #returns total memory slots before its to resize again
    def getCapacity(self) -> int:
        return self.capacity

if __name__ == "__main__":
    arr = DynamicArray(1)
    print("getSize:", arr.getSize())
    print("getCapacity:", arr.getCapacity())

    arr.pushback(1)
    print("getSize:", arr.getSize())
    print("getCapacity:", arr.getCapacity())

    arr.pushback(2)
    print("getSize:", arr.getSize())
    print("getCapacity:", arr.getCapacity())

    print("get 1:", arr.get(1))
    arr.set(1, 3)
    print ("get 1:", arr.get(1))
    print("popback: ", arr.popback())

    print("getSize:", arr.getSize())
    print("getCapacity:", arr.getCapacity())