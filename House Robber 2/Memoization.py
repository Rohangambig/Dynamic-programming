def HouseRobber(size,arr,dp):
    if size == 0: return arr[0]
    if size < 0: return 0
    if dp[size] != -1: return dp[size]

    pick = arr[size] + HouseRobber(size-2,arr,dp)
    nonPick = HouseRobber(size-1,arr,dp)

    dp[size] = max(pick,nonPick)
    return dp[size]

if __name__ == '__main__':
    arr = [1,2,3,1]
    size =  len(arr)

    arr1 = arr[:size-1]
    arr2 = arr[1:]

    dp1 = [-1 for _ in range(size-1)]
    dp2 = [-1 for _ in range(size-1)]

    print( max(HouseRobber(size-2,arr1,dp1) , HouseRobber(size-2,arr2,dp2)) )