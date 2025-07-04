
import java.util.Arrays;

class Memoization {
    public static int coinChange(int[] coins,int index,int sum,int[][] dp) {
        if(sum == 0) return 1;
        if(index < 0) return 0;
        if(dp[index][sum] != -1) return dp[index][sum];
        int take = 0;
        if(coins[index] <=  sum) 
            take = coinChange(coins, index, sum - coins[index],dp);
        
        int nonTake = coinChange(coins, index-1, sum,dp);

        return dp[index][sum] =  take + nonTake;

    }
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sumArray = 4;

        int size = coins.length-1;

        int[][] dp = new int[size+1][sumArray+1];
        for(int i = 0 ; i <= size; i++)
            Arrays.fill(dp[i], -1);

        System.out.println(coinChange(coins,size,sumArray,dp));
    }
}