class Solution:

    def change(self, amount: int, coins: List[int]) -> int:

        size = len(coins)
        dp = [ [0 for _ in range(amount+1)] for _ in range(size)]

        for index in range(size):
            for target in range(amount+1):
                if target == 0: dp[index][0] = 1
                else:
                    take = 0
                    if coins[index] <= target: take = dp[index][target-coins[index]]
                    nonTake = dp[index-1][target]
                    dp[index][target] =  take + nonTake
                    dp[index][target] 

        return dp[size-1][amount]