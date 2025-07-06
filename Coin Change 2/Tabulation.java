class Tabulation {

    public int change(int amount, int[] coins) {
        int size = coins.length;
        int[][] dp = new int[size][amount+1];

        for(int index = 0 ; index < size; index++) {
            for(int target = 0 ;target <= amount; target ++) {
                if(target == 0) dp[index][target] = 1;
                else {
                    int take = 0;
                    if(coins[index] <=  target) 
                        take = dp[index][target-coins[index]];
                    
                    int nonTake = 0;
                    if(index >= 1) nonTake =  dp[index-1][target];
                    dp[index][target] = nonTake + take;
                }
            }
        }

        return dp[size-1][amount];

    }
}