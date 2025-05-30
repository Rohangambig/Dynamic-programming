def HouseRobber(size,arr):
    prev2 = 0
    prev1 = arr[0]

    for i in range(1,size+1):
        take =  arr[i]
        if i > 1: take += prev2 
        nonTake = prev1

        prev2 = prev1 
        prev1 = max(take,nonTake)
    
    return prev1

if __name__ == '__main__':
    arr = [1,2,3,1]
    size =  len(arr)

    arr1 = arr[:size-1]
    arr2 = arr[1:]

    print( max(HouseRobber(size-2,arr1) , HouseRobber(size-2,arr2)) )