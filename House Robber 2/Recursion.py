def HouseRobber(size,arr):
    if size == 0: return arr[0]
    if size < 0: return 0

    pick = arr[size] + HouseRobber(size-2,arr)
    nonPick = HouseRobber(size-1,arr)

    return max(pick,nonPick)

if __name__ == '__main__':
    arr = [1,2,3,1]
    size =  len(arr)

    arr1 = arr[:size-1]
    arr2 = arr[1:]

    print( max(HouseRobber(size-2,arr1) , HouseRobber(size-2,arr2)) )