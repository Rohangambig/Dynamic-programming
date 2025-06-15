def findUnique(arr,m,n,dp):
    if m < 0 or n < 0: return 0
    if arr[m][n] == 1: return 0
    if(dp[m][n] != -1): return dp[m][n]
    if m == 0 and n == 0: return 1

    top = findUnique(arr,m-1,n,dp)
    left = findUnique(arr,m,n-1,dp)

    dp[m][n] = left + top
    return dp[m][n]

if __name__ == '__main__':
    arr = [ [0,0,0], [0,1,0], [0,0,0] ]
    m = len(arr)
    n = len(arr[0])

    dp = [ [-1]*n ] * m

    print(findUnique(arr,m-1,n-1,dp))