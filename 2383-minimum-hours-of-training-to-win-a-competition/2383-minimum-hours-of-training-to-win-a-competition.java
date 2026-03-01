class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int output1 = 0;
        int sum1 = 0;
        for(int i = 0; i < energy.length; i++){
            sum1 += energy[i];
        }

        if(sum1 >= initialEnergy){
            output1 = sum1 - initialEnergy + 1;
        }

        int sum2 = initialExperience;
        int output2 = 0;
        for(int i = 0; i < experience.length; i++){
            if(experience[i] >= sum2){
                int amount = experience[i] - sum2 + 1;
                output2 += amount;
                sum2 += amount;
            } 

            sum2 += experience[i];
        }
        
        return output1 + output2;
    }
}