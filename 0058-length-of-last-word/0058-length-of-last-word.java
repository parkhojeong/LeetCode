class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;
        boolean isStarted = false;
        while(i >= 0){
            if(isStarted && s.charAt(i) == ' ') break;

            if(s.charAt(i) == ' ') i--;
            else {
                isStarted = true;
                count += 1;
                i--;
            }
        }
        return count; 
        // String[] arr = s.trim().split("\\s+");
        // return arr[arr.length-1].length();
    }
}