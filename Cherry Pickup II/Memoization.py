def maximumPath(arr,i,j1,j2,m,n,dp):
    if i >= m or j1 < 0 or j1 >= n or j2 < 0 or j2 >= n: return -1e8
    if i == m-1: 
        if j1 == j2: return arr[i][j1]
        else: return arr[i][j1] +  arr[i][j2]
    
    if dp[i][j1][j2] != -1: return dp[i][j1][j2]

    maxi = -1e8
    for dj1 in range(-1,2):
        for dj2 in range(-1,2):
            value = 0
            if j1 ==  j2: value = arr[i][j1]
            else: value = arr[i][j1] +  arr[i][j2]

            value += maximumPath(arr,i+1,dj1 + j1,dj2 + j2,m,n,dp)

            maxi = max(maxi, value)
     
    dp[i][j1][j2] = maxi
    return dp[i][j1][j2]

def cherryPikup(arr,m,n):

    dp = [ [ [-1 for _ in range(n)] for _ in range(n) ] for _ in range(m)]
    return maximumPath(arr,0,0,n-1,m,n,dp)

if __name__ == "__main__":
    arr = [
        [3, 1, 1],
        [2,5,1],
        [1, 5, 5],
        [2, 1, 1]
    ]

    m = len(arr)
    n = len(arr[0])

    print(cherryPikup(arr,m,n))