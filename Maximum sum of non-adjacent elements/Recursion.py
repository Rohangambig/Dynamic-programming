def useRecursion(size,nums):
    if size == 0: return nums[0]
    if size < 0: return 0

    pick = nums[size] +  useRecursion(size-2,nums)
    nonPick = useRecursion(size-1,nums)

    return max(pick,nonPick)

def findMaximum(arr):
    size =  len(arr)-1

    return useRecursion(size,arr)

if __name__ == '__main__':
    print(findMaximum([2,1,4,9]))