coins = [1,2,3];
sumArray = 4;
size =  len(coins) - 1
dp = [ [0 for _ in range(sumArray + 1)] for _ in range(size + 1) ] 


for index in range(size+1):
    for sum in range(sumArray+1):
        if sum == 0: dp[index][sum ] = 1

        else:
            take = 0
            if coins[index] <= sum:
                take = dp[index][sum - coins[index]]
                
            nonTake = dp[index-1][sum]

            dp[index][sum] =  take + nonTake


print(dp[size][sumArray])