def MinimumPath(arr,i,j,size,dp):
    if size == i: return arr[size][j]
    if dp[i][j] != -1: return dp[i][j]

    left = arr[i][j] + MinimumPath(arr,i+1,j,size,dp)
    right = arr[i][j] + MinimumPath(arr,i+1,j+1,size,dp)

    dp[i][j] = min(left,right)
    return dp[i][j]

if __name__ == "__main__":
    triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
    i = len(triangle)

    dp = [ [-1 for _ in range(i)] for _ in range(i)]
    print(MinimumPath(triangle,0,0,i-1,dp))
    