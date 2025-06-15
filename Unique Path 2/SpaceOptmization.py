def findUnique(arr,m,n,dp):

    dp = [0 ] * (n+1)
    for i in range(m+1):

        temp = [0] * (n + 1)
        for j in range(n+1):
            if arr[i][j] == 1: continue 
            if i == 0 and j == 0: temp[0] = 1
            else:
                top = dp[j]

                left = 0
                if j > 0: left = temp[j-1]

                temp[j] =  top + left

        dp = temp

    return temp[n]

if __name__ == '__main__':
    arr = [ [0,0,0], [0,1,0], [0,0,0] ]
    m = len(arr)
    n = len(arr[0])

    dp = [ [0] *n ] * m

    print(findUnique(arr,m-1,n-1,dp))