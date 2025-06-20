
import java.util.Arrays;


public class Memoization {

    static int MinimumPath(int[][] arr,int i ,int j,int size,int[][] dp) {
        if(i == size-1) return arr[size-1][j];
        if(dp[i][j] != -1) return dp[i][j];

        int bottom = arr[i][j] + MinimumPath(arr, i+1, j, size,dp);
        int right = arr[i][j] + MinimumPath(arr, i+1, j+1, size,dp);

        return dp[i][j] = Math.min(bottom,right);
    }
    public static void main(String[] args) {
        int[][] arr = {
            {2},
            {3,4},
            {6,5,7},
            {4,1,8,3}
        };

        int size = arr.length;

        int[][] dp = new int[size][size];

        for(int i = 0 ; i < size; i ++) 
            Arrays.fill(dp[i],-1);

        System.out.println(MinimumPath(arr,0,0,size,dp));

    }
}