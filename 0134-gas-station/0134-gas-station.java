class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;
        int len = gas.length;
        int[] arr = new int[len];
        for(int i = 0; i < gas.length; i++) {
            gasSum += gas[i];
            costSum += cost[i];
            arr[i] = gas[i] - cost[i];
        }
        // System.out.println(Arrays.toString(gas));
        // System.out.println(Arrays.toString(cost));
        // System.out.println(Arrays.toString(arr));

        if(costSum > gasSum) return -1;

        int findStartIndex = -1;
        for(int i = 0; i < gas.length; i++) {
            int diff1 = gas[i] - cost[i];
            int j = (i+1) % len;
            int diff2 = gas[j] - cost[j];
            if(diff1 < 0 && diff2 > 0){
                findStartIndex = i;
                break;
            }
        }

        // System.out.println(findStartIndex);

        int i = 0;
        int sum = 0; 
        
        while(i < gas.length) {
            int cur = getPositiveIndex(findStartIndex - i, len);
            sum += arr[cur];
            if(sum < 0) i++;
            else {
                while(i < gas.length) {
                    cur = getPositiveIndex(findStartIndex - i, len);
                    if(arr[cur] >= 0){
                        ;
                    } else {
                        i--;
                        return getPositiveIndex(findStartIndex - i, len);
                    }

                    i++;
                }
            }
        }

        // System.out.println(findStartIndex +", " + i);
        return getPositiveIndex(findStartIndex - i + 1 , len);
    }

    int getPositiveIndex(int i, int size){
        return i >= 0 ? i : size+i;
    }
}
//  [5,1,2,3,4]
//  [4,4,1,5,1]
//  [1,]
