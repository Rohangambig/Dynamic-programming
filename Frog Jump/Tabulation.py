def FrogJump():
    arr = [7 ,5 ,5 ,8 ,4 ,9 ,1 ,1, 10 ]
    n = len(arr)
    dp = [-1 for _ in range(n)]
    dp[0] = 0

    for i in range(1,n):
        fs = dp[i-1] + abs(arr[i] - arr[i-1])
        if i > 1:
            sd = dp[i-2] + abs(arr[i] - arr[i-2])
        else: sd = float('inf')

        dp[i] = min(fs,sd)

    return dp[n-1]

if __name__ == "__main__":
    print(FrogJump())