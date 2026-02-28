class Solution {
    public int balancedStringSplit(String s) {
        int num = 0;
        int count = 0;
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == 'R') {
                num += 1;
            } else{
                num -= 1;
            }

            if(num == 0){
                count += 1;
            }
        }

        return count;
    }
}