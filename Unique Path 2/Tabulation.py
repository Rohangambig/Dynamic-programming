def findUnique(arr,m,n,dp):

    for i in range(m+1):
        for j in range(n+1):
            if arr[i][j] == 1: continue 
            if i == 0 and j == 0: dp[0][0] = 1
            else:

                top = 0
                if i > 0: top = dp[i-1][j]

                left = 0
                if j > 0: left = dp[i][j-1]

                dp[i][j] =  top + left

    return dp[m-1][n-1]

if __name__ == '__main__':
    arr = [ [0,0,0], [0,1,0], [0,0,0] ]
    m = len(arr)
    n = len(arr[0])

    dp = [ [0] *n ] * m

    print(findUnique(arr,m-1,n-1,dp))