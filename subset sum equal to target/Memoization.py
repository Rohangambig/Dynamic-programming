def subsetSum(arr,index,target,size):
    if target == 0: return True 
    if index == 0: return target == arr[index]

    nonTake = subsetSum(arr,index-1,target,size)
    take = False
    if target >= arr[index] :take = subsetSum(arr,index - 1,target - arr[index],size)

    return nonTake or take

if __name__ == '__main__':
    arr = [1,2,3,4]
    target = 4

    size = len(arr)
    print(subsetSum(arr,size-1,target,size))