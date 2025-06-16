def minimumPath(arr,m,n):
        if(m == 0 and n == 0): return arr[0][0]
        if( m < 0 or n < 0): return float('inf')

        top = arr[m][n] + minimumPath(arr, m-1, n)
        left = arr[m][n] + minimumPath(arr, m, n-1)

        return min(top,left)
    
if __name__ == '__main__':
    arr = [
        [1,2,3],
        [2,5,1]
    ]

    m = len(arr)
    n = len(arr[0])

    print(minimumPath(arr,m-1,n-1))
