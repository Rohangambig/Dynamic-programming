def minimumFallingSum(arr,size):
    dp = [ [ 0 for _ in range(size) ] for _ in range(size)]
    
    for i  in range(size):
        dp[size-1][i] = arr[size-1][i]


    for i in range(size-2,-1,-1):

        for j in range(size):
            res =  float('inf')
            for k in range(size):
                if k != j:
                    res = min(
                        res,
                        arr[i][j] + dp[i+1][k]
                    )
            
            dp[i][j] = res 

    return min(dp[0])

if __name__ == '__main__':
    arr = [
        [1,2,3],
        [1,2,3],
        [1,2,3]
    ]
    size =  len(arr)

    print(minimumFallingSum(arr,size))