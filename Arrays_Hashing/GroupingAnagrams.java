package Arrays_Hashing;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

//NeetCode 150
//Problem #4 Medium
//Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
class GroupingAnagrams{
    public List<List<String>> groupAnagrams(String[] strs){
        Map <String, List<String>> map = new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String (chars);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}