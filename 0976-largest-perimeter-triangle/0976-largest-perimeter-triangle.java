class Solution {
    public int largestPerimeter(int[] nums) {
        List<Integer> numsList = Arrays.stream(nums)
                                      .boxed()
                                      .collect(Collectors.toList());
        numsList.sort(Comparator.naturalOrder());

        int max = 0;
        for(int i = 2; i < numsList.size(); i++) {
            if(numsList.get(i-2) + numsList.get(i-1) > numsList.get(i)){
                max = numsList.get(i-2) + numsList.get(i-1) + numsList.get(i);
            }
        }
        return max;
    }
}