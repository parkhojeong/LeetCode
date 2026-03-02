class Solution {
    public int distMoney(int money, int children) {
        if(money < children){ 
            return -1;
        }

        int output = 0;
        while(children > 0){
            if(money < (8 + (children - 1))){ // rule 1,2
                break;
            }

            if(children == 1 && money > 8){ 
                break;
            }

            if(money / 8 >= 1){
                output += 1;
                money -= 8;
            } 

            children -= 1;
        }

        if(money == 4 && children == 1){ // rule 3
            output -= 1;
        }

        return output;
    }
}