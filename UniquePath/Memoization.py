def UniquePath(m,n,dp):
    if m == 0 and n == 0: return 1
    if m < 0 or n < 0: return 0
    if dp[m][n] != -1: return dp[m][n]

    top = UniquePath(m-1,n,dp)
    left = UniquePath(m,n-1,dp)

    dp[m][n] = top + left
    return dp[m][n]

if __name__ == "__main__":
    m = 3 ; n =7
    dp = [ [ -1 for _  in range(n) ] for _ in range(m)]
    
    print(UniquePath(m-1,n-1,dp))