def minimumPath(arr,m,n,dp):
        
        for i in range(m+1):
              
            for j in range(n+1):
                if i == 0 and j == 0: dp[i][j] = arr[i][j]
                else:
                    top = dp[i-1][j] if i > 0 else float('inf')
                    left = dp[i][j-1]  if j > 0 else float('inf')

                    dp[i][j] = arr[i][j] + min(top,left)
        
        return dp[m][n]

if __name__ == '__main__':
    arr = [
        [1,2,3],
        [2,5,1]
    ]

    m = len(arr)
    n = len(arr[0])

    dp = [ [-1]* n] * m

    print(minimumPath(arr,m-1,n-1,dp))
