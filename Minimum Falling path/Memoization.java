
import java.util.Arrays;


class Memoization {

    public static int MinimumFallingSum(int[][] arr,int r,int c,int size,int[][] dp) {
        if(r == size-1) return arr[r][c];
        if(dp[r][c] != -1) return dp[r][c];

        int result = Integer.MAX_VALUE;
        for(int i = 0; i < size; i ++) {
            if( i != c)
                result =  Math.min(result, arr[r][c] + MinimumFallingSum(arr, r+1, i, size,dp));
        }

        return dp[r][c] =  result;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };

        int size = arr.length;

        int[][] dp = new int[size][size];

        for(int i = 0 ; i < size; i++)
            Arrays.fill(dp[i],-1);

        int maximum = Integer.MAX_VALUE;
        for(int i = 0 ; i < size; i ++) {
            maximum = Math.min(maximum, MinimumFallingSum(arr,0,i,size,dp));
        }

        System.out.println(maximum);
    }
}