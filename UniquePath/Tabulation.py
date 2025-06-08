def UniquePath(m,n):
    dp = [ [-1 for _ in range(n)] for _ in range(m)]

    for i in range(m):
        for j in range(n):
            if i == 0 and j == 0: dp[0][0] = 1
            else:
                top = 0
                if i > 0 : top = dp[i-1][j]

                left = 0
                if j > 0: left = dp[i][j-1]

                dp[i][j] = top + left

    return dp[m-1][n-1]

if __name__ == "__main__":
    m = 3 ; n =7

    print(UniquePath(m,n))