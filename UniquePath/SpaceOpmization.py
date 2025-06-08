def UniquePath(m,n):
    dp =  [0 for _ in range(n)] 

    for i in range(m):
        temp =  [0 for _ in range(n)] 

        for j in range(n):
            if i == 0 and j == 0: temp[j] = 1
            else:
                temp[j] = dp[j]

                if j > 0: temp[j] += temp[j-1]

        dp =  temp

    return dp[n-1]

if __name__ == "__main__":
    m = 3 ; n =7

    print(UniquePath(m,n))