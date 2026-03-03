
class Solution {
    public int minDeletion(String s, int k) {
        Map<Character, Integer> charMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        if(charMap.keySet().size() <= k){
            return 0;
        }

        List<Integer> nums = new ArrayList<>();
        for(int num: charMap.values()){
            nums.add(num);
        }

        nums.sort(Comparator.naturalOrder());

        int output = 0;
        int diff = nums.size() - k;
        for(int i = 0; i < diff; i++){
            output += nums.get(i);
        }

        return output;
    }
}