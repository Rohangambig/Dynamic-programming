import java.util.Arrays;

public class Memoization {

    int FrogJump(int n,int arr[],int dp[]) {
        if(dp[n] != -1) return dp[n];
        if(n == 0) return 0;
        if(n < 0) return Integer.MAX_VALUE;

        int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
        if(n - 1 >= 0) left = Math.abs(arr[n] - arr[n-1]) + FrogJump(n-1, arr, dp);
        if(n - 2 >= 0) right = Math.abs(arr[n] - arr[n-2]) + FrogJump(n-2, arr, dp);

        return dp[n] = Math.min(left,right);
    }
    public static void main(String[] args) {
        int[] heights = {7 ,5 ,5 ,8 ,4 ,9 ,1 ,1, 10};
        int n =  heights.length;

        Memoization obj =  new Memoization();
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        
        System.out.println(obj.FrogJump(n-1,heights,dp));
    } 
}