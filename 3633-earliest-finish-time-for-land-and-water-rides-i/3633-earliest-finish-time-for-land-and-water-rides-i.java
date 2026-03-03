class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int finishTime1 = getEarliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        int finishTime2 = getEarliestFinishTime(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(finishTime1, finishTime2);
    }

    public int getEarliestFinishTime(int[] aStartTime, int[] aDuration, int[] bStartTime, int[] bDuration) {
        int aEarliestFinishTime = Integer.MAX_VALUE;
        for(int i = 0; i < aStartTime.length; i++){
            int finishTime = aStartTime[i] + aDuration[i];

            aEarliestFinishTime = Math.min(finishTime, aEarliestFinishTime);
        }

        int earliestFinishTime = Integer.MAX_VALUE;
        for(int i = 0; i < bStartTime.length; i++){
            int finishTime = 0;

            if(bStartTime[i] <= aEarliestFinishTime){
                finishTime = aEarliestFinishTime + bDuration[i];
            } else {
                finishTime = bStartTime[i] + bDuration[i];
            }

            earliestFinishTime = Math.min(finishTime, earliestFinishTime);
        }

        return earliestFinishTime;
    }
}
