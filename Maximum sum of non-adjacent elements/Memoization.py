def useRecursion(size,nums,dp):
    if size == 0: return nums[0]
    if size < 0: return 0
    if dp[size] != -1: return dp[size]

    pick = nums[size] +  useRecursion(size-2,nums,dp)
    nonPick = useRecursion(size-1,nums,dp)

    return max(pick,nonPick)

def findMaximum(arr):
    size =  len(arr)-1
    dp = [-1 for _ in range(size+1)]

    return useRecursion(size,arr,dp)

if __name__ == '__main__':
    print(findMaximum([2,1,4,9]))