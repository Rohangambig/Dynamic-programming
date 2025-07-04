def coinChange(coins,index,sum):
    if sum == 0: return 1
    if index < 0: return 0


    take = 0
    if coins[index] <= sum:
        take = coinChange(coins,index,sum - coins[index])
    nonTake = coinChange(coins,index-1,sum)

    return take + nonTake

coins = [1,2,3];
sumArray = 4;
size =  len(coins) - 1

print(coinChange(coins,size,sumArray))