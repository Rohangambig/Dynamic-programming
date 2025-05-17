def minimumJump(size,arr,dp):
    if dp[size] != -1: return dp[size]
    if size == 0: return 0
    if size < 0: return float('inf')

    right = left = float('inf')
    if size - 1 >= 0: left = abs(arr[size] - arr[size-1]) + minimumJump(size-1,arr,dp)
    if size - 2 >= 0: right = abs(arr[size] - arr[size-2]) + minimumJump(size-2,arr,dp)

    return min(left,right)

def FrogJump():
    arr = [7 ,5 ,5 ,8 ,4 ,9 ,1 ,1, 10 ]
    n = len(arr)
    dp = [-1 for _ in range(n) ]
    return minimumJump(n-1,arr,dp)

if __name__ == "__main__":
    print(FrogJump())