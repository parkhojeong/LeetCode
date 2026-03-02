class Solution {
    public int splitNum(int num) {
        String numberString = String.valueOf(num);
        char[] charArray = numberString.toCharArray();
        Arrays.sort(charArray);

        int i = 0;
        int j = 1;
        int num1 = 0;
        int num2 = 0;

        while (i < charArray.length){
            if(num1 >= 1){
                num1 *= 10;
            }
            num1 += Character.getNumericValue(charArray[i]);
            
            if(j >= charArray.length){
                break;
            }
            
            if(num2 >= 1){
                num2 *= 10;
            }
            num2 += Character.getNumericValue(charArray[j]);

            i += 2;
            j += 2;
        }
        return num1 + num2;
    }
}