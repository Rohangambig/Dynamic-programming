def minimumJump(arr,size,k,dp):
    if dp[size] != -1: return dp[size]
    if size == 0: return 0
    minimum = float('inf')

    for j in range(1,k+1):
        if size - j >= 0:
            minimum = min(minimum,abs(arr[size] - arr[size-j]) + minimumJump(arr,size-j,k,dp))
        else: break 
    
    dp[size] = minimum
    return dp[size]

def FrogJump():
    arr = [10, 5, 20, 0, 15]
    size = len(arr)-1
    k = 2
    dp = [-1 for _ in range(size+1)]

    return minimumJump(arr,size,k,dp)

if __name__ == "__main__":
    print(FrogJump())