class Solution {
    public int convertTime(String current, String correct) {
        int currentMinutes = convertMinutes(current);
        int correctMinutes = convertMinutes(correct);

        int diff = correctMinutes - currentMinutes;
        int output = 0;
        
        output += diff / 60;
        diff %= 60;

        output += diff / 15;
        diff %= 15;

        output += diff / 5;
        diff %= 5;

        output += diff;
        return output;
    }

    public int convertMinutes(String time) {
        int hour = Character.getNumericValue(time.charAt(0)) * 10 +  Character.getNumericValue(time.charAt(1));
        int minutes = Character.getNumericValue(time.charAt(3)) * 10 +  Character.getNumericValue(time.charAt(4));

        return hour * 60 + minutes;
    }
}