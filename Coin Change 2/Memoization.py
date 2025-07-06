class Solution:

    def change(self, amount: int, coins: List[int]) -> int:

        size = len(coins)
        def coinChange(coins,index,target,dp):
            if target == 0: return 1
            if index < 0: return 0
            if dp[index][target]  != -1: return dp[index][target]
            take = 0
            if coins[index] <= target: take = coinChange(coins,index,target-coins[index],dp)
            nonTake = coinChange(coins,index-1,target,dp)
            dp[index][target] =  take + nonTake
            return dp[index][target] 

        dp = [ [-1 for _ in range(amount+1)] for _ in range(size)]
        return coinChange(coins,size-1,amount,dp)