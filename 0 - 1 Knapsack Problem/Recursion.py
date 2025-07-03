def knapsack(val,wt,index,capacity):
    if capacity <= 0: return 0
    if index == 0:
        if capacity >= wt[0]: return val[0]
        return 0

    take = 0
    if capacity >= wt[index]: 
        take = val[index] + knapsack(val,wt,index-1,capacity-wt[index])
    nonTake = knapsack(val,wt,index-1,capacity)

    return max(take,nonTake)

if __name__ == '__main__':
    W = 4
    val = [1, 2, 3]
    wt = [4,5,1]

    size = len(val) - 1

    print(knapsack(val,wt,size,W))