class Solution {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> stroboMap = new HashMap<>();
        stroboMap.put('6', '9');
        stroboMap.put('9', '6');
        stroboMap.put('8', '8');
        stroboMap.put('1', '1');
        stroboMap.put('0', '0');
        
        for(int i = 0; i <= (num.length()-1)/2; i++) {
            char ch1 = num.charAt(i);
            char ch2 = num.charAt(num.length()-1-i);
            if(stroboMap.getOrDefault(ch1, ' ') != ch2) return false;
        }

        return true;
    }
}