import java.util.ArrayList;
import java.util.Arrays;

public class Memoization {

    public static int MaximumSum(ArrayList<Integer> nums,int size,int[] dp) {
        if(size == 0) return nums.get(0);
        if(size < 0) return 0;
        if(dp[size] != -1) return dp[size];

        int pick = nums.get(size) + MaximumSum(nums, size-2,dp);
        int nonPick = MaximumSum(nums, size-1,dp);

        return dp[size] = Math.max(pick,nonPick);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums =  new ArrayList<>(Arrays.asList(2 ,1 ,4 ,9));
        int size = nums.size();
        int[] dp = new int[size];
        Arrays.fill(dp,-1);
        System.out.println(MaximumSum(nums,size-1,dp));
    }
}