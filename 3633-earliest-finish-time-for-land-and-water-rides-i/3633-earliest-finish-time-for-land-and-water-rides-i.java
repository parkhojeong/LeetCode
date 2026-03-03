class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int finishTime1 = getFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        int finishTime2 = getFinishTime(waterStartTime, waterDuration, landStartTime, landDuration);
        return Math.min(finishTime1, finishTime2);
    }

    public int getFinishTime(int[] aStartTime, int[] aDuration, int[] bStartTime, int[] bDuration) {
        int aFinishTime = aStartTime[0] + aDuration[0];
        for(int i = 0; i < aStartTime.length; i++){
            if(aStartTime[i] + aDuration[i] < aFinishTime){
                aFinishTime = aStartTime[i] + aDuration[i];
            }
        }

        int finishTime = Integer.MAX_VALUE;
        for(int i = 0; i < bStartTime.length; i++){
            int duration = bDuration[i];
            int newFinishTime = 0;
            if(bStartTime[i] <= aFinishTime){
                newFinishTime = aFinishTime + duration;
            } else {
                newFinishTime = bStartTime[i] + duration;
            }

            if(newFinishTime < finishTime){
                finishTime = newFinishTime;
            }
        }

        return finishTime;
    }
}
