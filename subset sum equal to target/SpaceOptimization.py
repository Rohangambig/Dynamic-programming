if __name__ == '__main__':
    arr = [1,2,3,4]
    target_sum = 4

    size = len(arr)
    prev = [ False for _ in range(target_sum+1)]
    prev[0] = True 

    for index in range(1,size):

        cur = [ False for _ in range(target_sum+1)]
        cur[0] = True 

        for target in range(1,target_sum+1):
            nonTake = prev[target]
            take = False
            if target >= arr[index] :take = prev[target - arr[index]]

            cur[target] = nonTake or take

        prev = cur
    
    print(prev[target_sum])