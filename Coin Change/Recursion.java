class Recursion {
    public static int coinChange(int[] coins,int index,int sum) {
        if(sum == 0) return 1;
        if(index < 0) return 0;

        int take = 0;
        if(coins[index] <=  sum) 
            take = coinChange(coins, index, sum - coins[index]);
        
        int nonTake = coinChange(coins, index-1, sum);

        return take + nonTake;

    }
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sumArray = 4;

        int size = coins.length-1;
        System.out.println(coinChange(coins,size,sumArray));
    }
}