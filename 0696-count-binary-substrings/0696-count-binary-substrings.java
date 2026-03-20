class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> arr = new ArrayList<>();
        int zeroCount = 0;
        int oneCount = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '0'){
                if(oneCount != 0){
                    arr.add(oneCount);
                    oneCount = 0;
                }
                
                zeroCount++;
            } else {
                if(zeroCount != 0) {
                    arr.add(zeroCount);
                    zeroCount = 0;
                }

                oneCount++;
            }
        }
        if(zeroCount != 0) arr.add(zeroCount);
        if(oneCount != 0) arr.add(oneCount);

        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += Math.min(arr.get(i-1), arr.get(i));
        }

        return sum;
    }
}