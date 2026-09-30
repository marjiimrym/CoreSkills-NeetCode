package Arrays_Hashing; 
import java.util.HashMap;
import java.util.Map;

//NeetCode 150
//Problem #3
//Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
//You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
//Return the answer with the smaller index first.

class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}