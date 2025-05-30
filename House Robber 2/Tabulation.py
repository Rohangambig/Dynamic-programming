def HouseRobber(size,arr):
    dp = [-1 for _ in range(size+1)]

    dp[0] = arr[0]

    for i in range(1,size+1):
        take =  arr[i]
        if i > 1: take += dp[i-2]
        nonTake = dp[i-1]

        dp[i] = max(take,nonTake)
    
    return dp[size]

if __name__ == '__main__':
    arr = [1,2,3,1]
    size =  len(arr)

    arr1 = arr[:size-1]
    arr2 = arr[1:]

    print( max(HouseRobber(size-2,arr1) , HouseRobber(size-2,arr2)) )