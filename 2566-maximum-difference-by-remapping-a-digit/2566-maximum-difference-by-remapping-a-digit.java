class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        String max = "";
        String min = "";
        char first = str.charAt(0);
        for(int i = 0; i < str.length(); i++){
            if(first == '9'){
                first = str.charAt(i);
            }

            if(first != '9' && first == str.charAt(i)){
                max += "9";
            } else {
                max += str.charAt(i);
            }
        }

        first = str.charAt(0);
        for(int i = 0; i < str.length(); i++){
            if(first == str.charAt(i)){
                min += "0";
            } else {
                min += str.charAt(i);
            }
        }
        
        return Integer.valueOf(max) - Integer.valueOf(min);
    }
}