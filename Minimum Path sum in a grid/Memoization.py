def minimumPath(arr,m,n,dp):
        if(m == 0 and n == 0): return arr[0][0]
        if( m < 0 or n < 0): return float('inf')

        top = arr[m][n] + minimumPath(arr, m-1, n,dp)
        left = arr[m][n] + minimumPath(arr, m, n-1,dp)

        dp[m][n] = min(top,left)
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
