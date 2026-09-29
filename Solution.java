//NeetCode 150
//Problem 2 Easy
//Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false

class Solution{
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int num : count){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}