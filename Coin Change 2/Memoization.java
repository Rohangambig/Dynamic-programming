import java.util.Arrays;

class Memoization {

    public static int coinChange(int[] coins,int index,int target,int[][] dp) {
        if(target == 0) return 1;
        if(index < 0) return 0;
        if(dp[index][target] != -1) return dp[index][target];

        int take = 0;
        if(coins[index] <=  target) 
            take = coinChange(coins,index,target-coins[index],dp);
        
        int nonTake = coinChange(coins,index-1,target,dp);
        return dp[index][target] = nonTake + take;
    }

    public int change(int amount, int[] coins) {
        int size = coins.length;
        int[][] dp = new int[size][amount+1];

        for(int i = 0 ; i < size;i ++)
            Arrays.fill(dp[i],-1);

        return coinChange(coins,size-1,amount,dp);

    }
}