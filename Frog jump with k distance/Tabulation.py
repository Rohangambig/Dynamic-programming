def FrogJump():
    arr = [10, 5, 20, 0, 15]
    size = len(arr)-1
    k = 2
    dp = [-1 for _ in range(size+1)]
    dp[0] = 0

    for i in range(1,size+1):
        minimum = float('inf')

        for j in range(1,k+1):
            if i - j >= 0: minimum = min(minimum,dp[i-j] + abs(arr[i] - arr[i-j]))
            else: break 
        dp[i] = minimum

    return dp[size]

if __name__ == "__main__":
    print(FrogJump())