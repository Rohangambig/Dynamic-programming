def minimumPath(arr,m,n,dp):
        dp = [0] * (n+1)
        for i in range(m+1):
            temp = [0] * (n+1)

            for j in range(n+1):
                if i == 0 and j == 0: temp[j] = arr[i][j]
                else:
                    top = dp[j] if i > 0 else float('inf')
                    left = temp[j-1]  if j > 0 else float('inf')

                    temp[j] = arr[i][j] + min(top,left)
            dp = temp 
        return dp[n]

if __name__ == '__main__':
    arr = [
        [1,2,3],
        [2,5,1]
    ]

    m = len(arr)
    n = len(arr[0])

    dp = [ [-1]* n] * m

    print(minimumPath(arr,m-1,n-1,dp))
