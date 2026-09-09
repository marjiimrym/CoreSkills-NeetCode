#include <iostream>

class DynamicArray {
private: 
    int* array;
    int length; 
    int capacity;

public:
    //Constructor to initalize changeable array
    DynamicArray(int capacity) : capacity(capacity), length(0){
        array = new int[capacity];
    }

    //retrieve value from i-th index
    int get(int i) {
        return array[i];
    }

    //set n value at i-th index
    void set(int i, int n) {
        array[i] = n;
    }

    //assert n in the last position in the array
    void pushback(int n){
        if (length == capacity){
            resize();
        }
        array[length] = n; 
        length++;
    }

    //remove last element from array and then we return it
    int popback() {
        if (length > 0){
            length--;
        }
        return array[length];
    }   

    //resize array
    void resize() {
        capacity *= 2;
        int* newArray = new int[capacity];
        for (int i = 0; i < length; i++){
            newArray[i] = array[i];
        }
        delete[] array;
        array = newArray;
    }

    //return current array size
    int getSize() {
        return length;
    }
    //return current capacity of array
    int getCapacity() {
        return capacity;
    }
};
    