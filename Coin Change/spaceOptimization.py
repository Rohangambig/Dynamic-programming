coins = [1,2,3];
sumArray = 4;
size =  len(coins) - 1
prev =  [0 for _ in range(sumArray + 1)] 
cur =  [0 for _ in range(sumArray + 1)] 

for index in range(size+1):
    for sum in range(sumArray+1):
        if sum == 0: cur[sum ] = 1

        else:
            take = 0
            if coins[index] <= sum:
                take = cur[sum - coins[index]]
                
            nonTake = prev[sum]

            cur[sum] =  take + nonTake
    prev = cur

print(prev[sumArray])