class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            switch (ch) {
                case 'I': 
                    if(i < s.length() -1 ){
                        char nextCh = s.charAt(i+1);
                        if(nextCh == 'V'){
                            i+= 2;
                            sum += 4;
                            continue;
                        } else if(nextCh == 'X'){
                            sum += 9;
                            i+=2;
                            continue;
                        }
                    }
                    sum += 1;
                    break;
                case 'V': sum += 5;
                    break;
                case 'X': 
                    if(i < s.length() -1 ){
                        char nextCh = s.charAt(i+1);
                        if(nextCh == 'L'){
                            sum += 40;
                            i += 2;
                            continue;
                        } else if(nextCh == 'C'){
                            sum += 90;
                            i+= 2;
                            continue;
                        }
                    }
                    sum += 10;
                    break;
                case 'L': sum += 50;
                    break;
                case 'C': 
                    if(i < s.length() -1 ){
                        char nextCh = s.charAt(i+1);
                        if(nextCh == 'D'){
                            sum += 400;
                            i +=2;
                            continue;
                        } else if(nextCh == 'M'){
                            sum += 900;
                            i += 2;
                            continue;
                        }
                    }
                    sum += 100;
                    break;
                case 'D': sum += 500;
                    break;
                case 'M': sum += 1000;
                    break;
                default:
                    break;
            }

            i++;
        }

        

        return sum;
    }
}