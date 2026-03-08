class Solution {
    public int maxRepeating(String sequence, String word) {
        int i = 0;
        int output = 0;
        
        while(i < sequence.length()){
            int count = 0;
            while(i + word.length() <= sequence.length() && 
                sequence.substring(i, i + word.length()).equals(word)){
                i += word.length();
                count += 1;
            }
            
            output = Math.max(output, count);
            if(count > 0){
                i -= word.length();
            }    
            i +=1;
        }

        return output;
    }
}