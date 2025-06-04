def NinjaTrain(i,j,arr):
    if i == 0:
        maximum = 0
        for k in range(3):
            if j != k:
                maximum = max(maximum,arr[0][k])
        return maximum

    maximum = 0
    for k in range(3):
        if j != k:
            maximum = max(maximum,arr[i][k] + NinjaTrain(i-1,k,arr) )
    
    return maximum
  
def ninjaTraining(n, arr):

    maximum = 0
    for j in range(3):
            dummy_max = arr[n-1][j] + NinjaTrain(n-2,j,arr)
            maximum = max(maximum, dummy_max )

    return maximum

if __name__ == "__main__":
    print(ninjaTraining(3,[ [18 ,11 ,19],
                            [4, 13 ,7],
                            [1, 8 ,13] ] ))