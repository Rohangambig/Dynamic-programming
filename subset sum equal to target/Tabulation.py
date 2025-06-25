if __name__ == '__main__':
    arr = [1,2,3,4]
    target_sum = 4

    size = len(arr)
    dp = [ [False for _ in range(target_sum+1)] for _ in range(size)]

    for i in range(size):
        dp[i][0] = True 
    
    dp[0][arr[0]] = True;

    for index in range(1,size):
        for target in range(1,target_sum+1):
            nonTake = dp[index-1][target]
            take = False
            if target >= arr[index] :take = dp[index - 1][target - arr[index]]

            dp[index][target] = nonTake or take

    
    print(dp[size-1][target_sum])