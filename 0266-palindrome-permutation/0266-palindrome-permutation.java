class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        boolean hasOdd = false;
        for (int value : map.values()) {
            if(hasOdd && value % 2 == 1) return false;
            if(value % 2 == 1) hasOdd = true;
        }

        return true;
    }
}