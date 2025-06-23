def cherryPikup(arr,m,n):

    dp = [  [0 for _ in range(n)] for _ in range(n) ] 
    
    for j1 in range(n):
        for j2 in range(n):
            if j1 == j2: dp[j1][j2] = arr[m-1][j2]
            else: dp[j1][j2] =  arr[m-1][j1] + arr[m-1][j2]

    for i in range(m-2,-1,-1):
        temp = [  [0 for _ in range(n)] for _ in range(n) ] 

        for j1 in range(n):
            for j2 in range(n):
                maxi = -1e8
                for dj1 in range(-1,2):
                    for dj2 in range(-1,2):
                        value = 0
                        if j1 ==  j2: value = arr[i][j1]
                        else: value = arr[i][j1] +  arr[i][j2]

                        if dj1 + j1 >= 0 and dj1 + j1 < n and dj2 + j2 >= 0 and dj2 + j2 < n:
                            value += dp[dj1 + j1][dj2 + j2]

                        maxi = max(maxi, value)
                
                temp[j1][j2] = maxi
        dp = temp

    return dp[0][n-1]

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