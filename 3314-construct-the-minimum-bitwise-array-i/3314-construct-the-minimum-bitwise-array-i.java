class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] arr = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if(num % 2 == 0) {
                arr[i] = -1;
                continue;
            }
            arr[i] = getMinBitWise(num);
        }

        return arr;
    }

    public int getMinBitWise(Integer num) {
        List<Integer> bits = new ArrayList<>(); 
        int q = num;
        while(q > 0){
            bits.addFirst(q % 2);
            q = q / 2;
        }
        // System.out.println(bits);

        int zeroCount = 0;
        for(int i = 0; i < bits.size(); i++){
            if(bits.get(i) == 0) zeroCount++;
        }

        if(zeroCount == 0){
            return num / 2;
        }

        if(bits.getLast() == 0){
            return num - 1;
        }

        int i = 1;
        while(true){
            int bit = bits.get(bits.size() - i);
            if(bit == 0) break;
            i++;
        }

        return num - (int) Math.pow(2, i-2);
    }
}

// 11
// 1 0 1 1
//       
// 1.    1
// 1   1 1

// 1 1 0 1
// 1 1   0


//   1 1 1
//   1 1 0 


// 1 1 1 1 1
// 1 1 1 1 0
// 0 1 1 1 1 