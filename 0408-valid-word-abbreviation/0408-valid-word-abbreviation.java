class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;

        while(i < word.length() && j < abbr.length()){
            if(Character.isLetter(abbr.charAt(j))){
                if(word.charAt(i) != abbr.charAt(j)) return false;
                i++;
                j++;
            }else{
                if(abbr.charAt(j) == '0') return false;
                String str = "";
                while(j < abbr.length()){
                    if(!Character.isLetter(abbr.charAt(j))){
                        str += abbr.charAt(j);
                        j++;
                    }else{
                        break;
                    } 
                }
                i += Integer.valueOf(str);
            }
        }

        return i == word.length() && j == abbr.length();
    }
}