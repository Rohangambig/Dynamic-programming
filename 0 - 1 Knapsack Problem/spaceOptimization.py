if __name__ == '__main__':
    W = 4
    val = [1, 2, 3]
    wt = [4,5,1]

    size = len(val) - 1
    prev = [0 for _ in range(W+1)] 

    for i in range(W+1):
        if i >= wt[0]: prev[i] = val[0]
    
    for index in range(1,size+1):
        cur = [0 for _ in range(W+1)] 

        for capacity in range(W+1):
            take = 0
            if capacity >= wt[index]: 
                take = val[index] + prev[capacity-wt[index]]
            nonTake = prev[capacity]

            cur[capacity] = max(take,nonTake)

        prev = cur

    print(prev[W])