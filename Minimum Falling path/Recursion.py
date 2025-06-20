def minimumPath(arr,r,c,size):
    if r == size-1: return arr[r][c]

    res = float('inf')
    for last in range(size):
        if last !=  c:
            res = min(res,arr[r][c] + minimumPath(arr,r+1,last,size))
    
    return res

def minimumFallingSum(arr,size):
    ans = float('inf')
    for i in range(size):
        ans =  min(ans,minimumPath(arr,0,i,size))
    return ans 

if __name__ == '__main__':
    arr = [
        [1,2,3],
        [1,2,3],
        [1,2,3]
    ]
    size =  len(arr)

    print(minimumFallingSum(arr,size))