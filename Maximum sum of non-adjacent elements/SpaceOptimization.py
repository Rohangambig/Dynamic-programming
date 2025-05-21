def findMaximum(arr):
    size =  len(arr)-1
    prev1 = arr[0]
    prev2 = 0

    for i in range(1,size+1):
        take = arr[i]
        if i > 1: take += prev2
        nonTake = prev1 

        prev2 = prev1 
        prev1 = max(take,nonTake)

    return prev1

if __name__ == '__main__':
    print(findMaximum([2,1,4,9]))