def ninjaTraining(n, arr):
    dp = [ [-1 , -1 , -1] for _ in range(3)]

    for i in range(3):
        dp[0][i] = arr[0][i]
    
    for i in range(1,n):
        for j in range(3):
            maximum = 0
            for k in range(3):
                if j != k:
                    maximum = max(maximum,arr[i][j] + dp[i-1][k])
            dp[i][j] =  maximum 

    ans = 0
    for i in range(3):
        ans = max(ans,dp[n-1][i])
    return ans

if __name__ == "__main__":
    print(ninjaTraining(3,[ [18 ,11 ,19],[4, 13 ,7],[1, 8 ,13] ] ))