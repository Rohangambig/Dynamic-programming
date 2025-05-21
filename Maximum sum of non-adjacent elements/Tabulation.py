def findMaximum(arr):
    size =  len(arr)-1
    dp = [-1 for _ in range(size+1)]
    dp[0] = arr[0]

    for i in range(1,size+1):
        take = arr[i]
        if i > 1: take += dp[i-2]
        nonTake = dp[i-1]

        dp[i] = max(take,nonTake)

    return dp[size]

if __name__ == '__main__':
    print(findMaximum([2,1,4,9]))