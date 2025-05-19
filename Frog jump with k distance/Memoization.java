import java.util.Arrays;

public class Memoization {

    public static int FropJump(int size,int[] heights,int k,int[] dp) {
        if(dp[size] != -1) return dp[size];
        if(size == 0) return 0;
        int minimumJump = Integer.MAX_VALUE;

        for(int j = 1;j <= k ;j ++) {
            if(size - j >= 0) {
                int jump = FropJump(size-j, heights, k, dp) + Math.abs(heights[size] - heights[size-j]);
                minimumJump = Math.min(jump, minimumJump);
            }

            else {
                break;
            }
        }
        return dp[size] = minimumJump;
    }
    public static void main(String[] args) {
        int heights[] = {10, 5, 20, 0, 15};
        int size = heights.length;
        int dp[] = new int[size];
        int k = 2;
        Arrays.fill(dp, -1);

        System.out.println(FropJump(size-1,heights,k,dp));
    }
}