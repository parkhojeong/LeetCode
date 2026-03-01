class Solution {
    public String maximumTime(String time) {
        String output = "";

        if(time.charAt(0) == '?'){
            if(time.charAt(1) <= '3' || time.charAt(1) == '?'){
                output += "2";
            } else {
                output += "1";
            }
            
        } else {
            output += time.charAt(0);
        }

        if(time.charAt(1) == '?'){
            if(output.equals("2")){
                output += "3";
            } else {
                output += "9";
            }
        } else {
            output += time.charAt(1);
        }

        output += ":";

        if(time.charAt(3) == '?'){
            output += "5";
        } else {
            output += time.charAt(3);
        }

        if(time.charAt(4) == '?'){
            output += "9";
        } else {
            output += time.charAt(4);
        }

        return output;
    }
}