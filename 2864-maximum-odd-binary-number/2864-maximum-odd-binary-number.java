class Solution {
    public String maximumOddBinaryNumber(String s) {
        int oneCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                oneCount += 1;
            }
        }

        char[] arr = new char[s.length()];
        oneCount -= 1;
        arr[s.length()-1] = '1';

        for(int i = 0; i < arr.length - 1; i++){
            if(oneCount > 0) {
                arr[i] = '1';
                oneCount -= 1;
            } else {
                arr[i] = '0';
            }
        }

        return new String(arr);

    }
}