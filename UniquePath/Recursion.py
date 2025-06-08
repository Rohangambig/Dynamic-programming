def UniquePath(m,n):
    if m == 0 and n == 0: return 1
    if m < 0 or n < 0: return 0

    top = UniquePath(m-1,n)
    left = UniquePath(m,n-1)

    return top + left

if __name__ == "__main__":
    m = 3 ; n =7

    print(UniquePath(m-1,n-1))