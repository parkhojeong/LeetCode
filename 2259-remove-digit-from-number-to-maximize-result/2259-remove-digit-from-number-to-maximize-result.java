class Solution {
    public String removeDigit(String number, char digit) {
        int digitIndex = -1;
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) != digit) {
                continue;
            }
        
            digitIndex = i;

            if(i == number.length()-1){
                continue;
            }

            if(number.charAt(i) < number.charAt(i+1)){
                return number.substring(0,i) + number.substring(i+1);    
            }

        }

        return number.substring(0, digitIndex) + number.substring(digitIndex+1);
    }
}