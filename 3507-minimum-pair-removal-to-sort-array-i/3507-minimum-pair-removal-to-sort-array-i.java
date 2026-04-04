class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toList());

        
        int count = 0;
        while(true){
            // System.out.println(list);
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            boolean isIncreasing = true;
            int i = 1;
            while(i < list.size()) {
                int diff = list.get(i) - list.get(i-1);
                if(diff < 0){
                    isIncreasing = false;
                }
                if(list.get(i) + list.get(i-1) < min) {
                    min = list.get(i) + list.get(i-1);
                    minIndex = i;
                }
                i++;
            }

            if(isIncreasing) break;
            
            list.set(minIndex-1, min);
            list.remove(minIndex);
            count++;
        }

        return count;
    }
}

// 5 2 3 1
// 5 2 3 1 5 
// 1 2 2 