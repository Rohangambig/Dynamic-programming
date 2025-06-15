def findUnique(arr,m,n):
    if m < 0 or n < 0: return 0
    if arr[m][n] == 1: return 0
    if m == 0 and n == 0: return 1

    top = findUnique(arr,m-1,n)
    left = findUnique(arr,m,n-1)

    return left + top

if __name__ == '__main__':
    arr = [ [0,0,0], [0,1,0], [0,0,0] ]
    m = len(arr)
    n = len(arr[0])

    print(findUnique(arr,m-1,n-1))