def knapsack(val,wt,index,capacity,dp):
    if capacity <= 0: return 0
    if index == 0:
        if capacity >= wt[0]: return val[0]
        return 0
    if dp[index][capacity]  != -1: return dp[index][capacity]

    take = 0
    if capacity >= wt[index]: 
        take = val[index] + knapsack(val,wt,index-1,capacity-wt[index],dp)
    nonTake = knapsack(val,wt,index-1,capacity,dp)

    dp[index][capacity] = max(take,nonTake)
    return dp[index][capacity]

if __name__ == '__main__':
    W = 4
    val = [1, 2, 3]
    wt = [4,5,1]

    size = len(val) - 1
    dp = [ [-1 for _ in range(W+1)] for _ in range(size+1)]

    print(knapsack(val,wt,size,W,dp))