def FrogJump():
    arr = [7 ,5 ,5 ,8 ,4 ,9 ,1 ,1, 10 ]
    n = len(arr)
    prev1 = prev2 = 0

    for i in range(1,n):
        fs =  prev1 +  abs(arr[i] - arr[i-1])
        if i > 1: sd =  prev2 +  abs(arr[i] - arr[i-2])
        else: sd = float('inf')

        prev2 = prev1
        prev1 = min(sd,fs)

    return prev1

if __name__ == "__main__":
    print(FrogJump())