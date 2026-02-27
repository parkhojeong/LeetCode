class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] changes = {0, 0}; 
        for(int bill: bills){
            switch (bill) {
                case 5:
                    changes[0] += 1;
                    break;
                case 10:
                    if(changes[0] >= 1){
                        changes[0] -= 1;
                        changes[1] += 1;                        
                    } else {
                        return false;
                    }
                    break;
                case 20:
                    if(changes[1] >= 1 && changes[0] >= 1){
                        changes[1] -= 1;
                        changes[0] -= 1;
                    } else if(changes[0] >= 3){
                        changes[0] -= 3;
                    } else {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }

        return true;
    }
}