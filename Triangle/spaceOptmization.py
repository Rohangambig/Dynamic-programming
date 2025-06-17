def MinimumPath(arr,size):

    dp = arr[size]
    k = size 
    for i in range(size-1,-1,-1):

        temp = [0] * k

        for j in range(i+1):

            left = dp[j]
            right =  dp[j+1] 

            temp[j] = arr[i][j] +  min(left,right)

       
        dp = temp
        k -= 1
    return dp[0]

if __name__ == "__main__":
    triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
    i = len(triangle)

    print(MinimumPath(triangle,i-1))
    