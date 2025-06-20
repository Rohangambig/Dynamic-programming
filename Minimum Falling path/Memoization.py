def minimumPath(arr,r,c,size,dp):
    if r == size-1: return arr[r][c]
    if dp[r][c] != -1: return dp[r][c]

    res = float('inf')
    for last in range(size):
        if last !=  c:
            res = min(res,arr[r][c] + minimumPath(arr,r+1,last,size,dp))
    
    dp[r][c] = res
    return dp[r][c]

def minimumFallingSum(arr,size):
    ans = float('inf')

    dp = [ [-1 for _ in range(size)] for _ in range(size)]
    

    for i in range(size):
        ans =  min(ans,minimumPath(arr,0,i,size,dp))
    return ans 

if __name__ == '__main__':
    arr = [
        [1,2,3],
        [1,2,3],
        [1,2,3]
    ]
    size =  len(arr)

    print(minimumFallingSum(arr,size))