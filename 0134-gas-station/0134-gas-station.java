class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;
        int len = gas.length;

        int[] arr = new int[len];   
        for(int i = 0; i < len; i++) {
            gasSum += gas[i];
            costSum += cost[i];
            arr[i] = gas[i] - cost[i];
        }

        if(costSum > gasSum) return -1;

        int findStartIndex = -1;
        for(int i = 0; i < len; i++) {
            int j = (i+1) % len;
            if(arr[i] < 0 && arr[j] > 0){
                findStartIndex = i;
                break;
            }
        }

        int i = 0;
        int sum = 0; 
        
        while(i < len) {
            int cur = getPositiveIndex(findStartIndex - i, len);
            sum += arr[cur];
            if(sum < 0) i++;
            else {
                while(i < len) {
                    cur = getPositiveIndex(findStartIndex - i, len);
                    
                    if(arr[cur] < 0){
                        i--;
                        return getPositiveIndex(findStartIndex - i, len);
                    }

                    i++;
                }
            }
        }

        return getPositiveIndex(findStartIndex - i + 1 , len);
    }

    int getPositiveIndex(int i, int size){
        return i >= 0 ? i : size+i;
    }
}
//  [5,1,2,3,4]
//  [4,4,1,5,1]
//  [1,]
