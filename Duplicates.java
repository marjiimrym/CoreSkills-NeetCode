//NeetCode 150
//Problem #1 Easy 
//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.HashSet;

class Duplicates{
    public boolean hasDuplicate (int[] nums){
        HashSet<Integer> set = new HashSet();
        for (int num : nums){
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}