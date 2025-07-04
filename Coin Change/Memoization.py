def coinChange(coins,index,sum,dp):
    if sum == 0: return 1
    if index < 0: return 0
    if dp[index][sum] != -1: return dp[index][sum]

    take = 0
    if coins[index] <= sum:
        take = coinChange(coins,index,sum - coins[index],dp)
    nonTake = coinChange(coins,index-1,sum,dp)

    dp[index][sum] =  take + nonTake
    return dp[index][sum]

coins = [1,2,3];
sumArray = 4;
size =  len(coins) - 1
dp = [ [-1 for _ in range(sumArray + 1)] for _ in range(size + 1) ] 
print(coinChange(coins,size,sumArray,dp))