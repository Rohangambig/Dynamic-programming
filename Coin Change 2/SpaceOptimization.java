class SpaceOptimization {


    public int change(int amount, int[] coins) {
        int size = coins.length;
        int[] prev = new int[amount+1];
        int[] cur = new int[amount+1];

        for(int index = 0 ; index < size; index++) {
            for(int target = 0 ;target <= amount; target ++) {
                if(target == 0) cur[target] = 1;
                else {
                    int take = 0;
                    if(coins[index] <=  target) 
                        take = cur[target-coins[index]];
                    
                    int nonTake = 0;
                    if(index >= 1) nonTake =  prev[target];
                    cur[target] = nonTake + take;
                }
            }

            prev = cur;
        }

        return prev[amount];

    }
}