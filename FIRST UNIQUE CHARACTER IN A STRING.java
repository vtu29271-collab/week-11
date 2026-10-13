import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }   
        return -1;
    }
    public static void main(String[] args) {
        Solution solver = new Solution();
        String test1 = "leetcode";
        String test2 = "loveleetcode";
        String test3 = "aabb";
        System.out.println("Input: \"" + test1 + "\" -> Output: " + solver.firstUniqChar(test1)); 
        System.out.println("Input: \"" + test2 + "\" -> Output: " + solver.firstUniqChar(test2)); 
        System.out.println("Input: \"" + test3 + "\" -> Output: " + solver.firstUniqChar(test3)); 
    }
}