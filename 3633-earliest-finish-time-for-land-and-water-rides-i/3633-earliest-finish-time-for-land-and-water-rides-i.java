class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int finishTime1 = getFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        int finishTime2 = getFinishTime(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(finishTime1, finishTime2);
    }

    public int getFinishTime(int[] aStartTime, int[] aDuration, int[] bStartTime, int[] bDuration) {
        int aEndTime = aStartTime[0] + aDuration[0];
        for(int i = 0; i < aStartTime.length; i++){
            if(aStartTime[i] + aDuration[i] < aEndTime){
                aEndTime = aStartTime[i] + aDuration[i];
            }
        }

        int output = Integer.MAX_VALUE;
        for(int i = 0; i < bStartTime.length; i++){
            int duration = bDuration[i];
            if(bStartTime[i] <= aEndTime){
                if(aEndTime + duration < output){
                    output = aEndTime + duration;
                }
            } else {
                if(bStartTime[i] + duration < output) {
                    output = bStartTime[i] + duration;
                }
            }
        }

        return output;
    }
}
