def MinimumPath(arr,size,dp):

    for j in range(size+1):
        dp[size][j] = arr[size][j]

    for i in range(size-1,-1,-1):

        for j in range(i+1):

            left = dp[i+1][j]
            right =  dp[i+1][j+1] 

            dp[i][j] = arr[i][j] +  min(left,right)

    return dp[0][0]

if __name__ == "__main__":
    triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
    i = len(triangle)

    dp = [ [0 for _ in range(i)] for _ in range(i)]
    print(MinimumPath(triangle,i-1,dp))
    