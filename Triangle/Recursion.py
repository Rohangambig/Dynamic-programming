def MinimumPath(arr,i,j,size):
    if size == i: return arr[size][j]

    left = arr[i][j] + MinimumPath(arr,i+1,j,size)
    right = arr[i][j] + MinimumPath(arr,i+1,j+1,size)

    return min(left,right)

if __name__ == "__main__":
    triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
    i = len(triangle)

    print(MinimumPath(triangle,0,0,i-1))
    