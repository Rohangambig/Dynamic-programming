class Recursion {

    public static int coinChange(int[] coins,int index,int target) {
        if(target == 0) return 1;
        if(index < 0) return 0;

        int take = 0;
        if(coins[index] <=  target) 
            take = coinChange(coins,index,target-coins[index]);
        
        int nonTake = coinChange(coins,index-1,target);
        return nonTake + take;
    }

    public int change(int amount, int[] coins) {
        int size = coins.length;

        return coinChange(coins,size-1,amount);

    }
}