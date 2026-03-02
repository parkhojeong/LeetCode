class Solution {
    public int distMoney(int money, int children) {
        if(money < children){ // rule1,2 are not follwing 
            return -1;
        }

        int output = 0;
        while(children > 0){
            if(money < (8 + (children - 1))){ // anyone can't get 8 dollar anymore
                break;
            }

            if(children == 1 && money > 8){ // the last children takes all money
                break;
            }

            if(money / 8 >= 1){
                output += 1;
                money -= 8;
            } 

            children -= 1;
        }

        if(money == 4 && children == 1){ // for rule 3
            output -= 1;
        }

        return output;
    }
}