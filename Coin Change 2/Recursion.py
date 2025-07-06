class Solution:

    def change(self, amount: int, coins: List[int]) -> int:

        size = len(coins)
        def coinChange(coins,index,target):
            if target == 0: return 1
            if index < 0: return 0
            take = 0
            if coins[index] <= target: take = coinChange(coins,index,target-coins[index])
            nonTake = coinChange(coins,index-1,target)
            return take + nonTake

        
        return coinChange(coins,size-1,amount)