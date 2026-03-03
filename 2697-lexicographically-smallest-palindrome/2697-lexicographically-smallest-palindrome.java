class Solution {
    public String makeSmallestPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        char[] arr = new char[s.length()];
        while(l <= r){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if (ch1 > ch2) {
                arr[l] = ch2;
                arr[r] = ch2;
            } else {
                arr[l] = ch1;
                arr[r] = ch1;
            }

            l++;
            r--;
        }


        return new String(arr);
    }
}