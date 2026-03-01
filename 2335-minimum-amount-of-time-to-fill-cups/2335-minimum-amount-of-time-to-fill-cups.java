class Solution {
    public int fillCups(int[] amount) {
        int output = 0;
        while(true) {
            if(amount[0] <= 0 && amount[1] <= 0 && amount[2] <= 0){
                break;
            }

            if(amount[0] >= amount[1] && amount[0] >= amount[2]){
                amount[0] -= 1;
                if(amount[1] >= amount[2]){
                    amount[1] -= 1;
                } else{
                    amount[2] -= 1;
                }
            } else if(amount[1] >= amount[0] && amount[1] >= amount[2]){
                amount[1] -= 1;
                if(amount[0] >= amount[2]){
                    amount[0] -= 1;
                } else {
                    amount[2] -= 1;
                }
            } else if(amount[2] >= amount[0] && amount[2] >= amount[1]){
                amount[2] -= 1;
                if(amount[0] >= amount[1]){
                    amount[0] -= 1;
                } else {
                    amount[1] -= 1;
                }
            }

            output += 1;
        }

        return output;
    }
}