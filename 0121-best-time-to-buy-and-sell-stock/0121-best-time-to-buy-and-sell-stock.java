class Solution {
    public int maxProfit(int[] prices) {
        int[] arr = new int[]{prices[0], prices[0]};
        List<Integer> candidates = new ArrayList<>();

        for(int i = 1; i < prices.length; i++){
            int price = prices[i];
            if(arr[0] > price) {
                candidates.add(arr[1]-arr[0]);
                arr[0] = arr[1] = price;
            }else if(arr[1] < price){
                arr[1] = price;
            }
        }

        candidates.add(arr[1] - arr[0]);

        int max = 0;
        for(int i = 0 ; i < candidates.size(); i++) {
            if(max < candidates.get(i)) max = candidates.get(i);
        }

        return max;
    }
}