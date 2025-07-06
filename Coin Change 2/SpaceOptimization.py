class Solution:

    def change(self, amount: int, coins: List[int]) -> int:

        size = len(coins)
        prev =  [0 for _ in range(amount+1)] 
        cur =  [0 for _ in range(amount+1)] 

        for index in range(size):
            for target in range(amount+1):
                if target == 0: cur[0] = 1
                else:
                    take = 0
                    if coins[index] <= target: take = cur[target-coins[index]]
                    nonTake = prev[target]
                    cur[target] =  take + nonTake

            prev = cur

        return prev[amount]