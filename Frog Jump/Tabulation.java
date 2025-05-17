
import java.util.Arrays;

public class Tabulation {
    public static void main(String[] args) {
        int[] arr = {7 ,5 ,5 ,8 ,4 ,9 ,1 ,1, 10};
        int n =  arr.length;

        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = 0;

        for(int i = 1; i < n;i ++) {
            int fs = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
            int sd ;
            if( i > 1) sd = dp[i-2] + Math.abs(arr[i] -  arr[i-2]);
            else  sd = Integer.MAX_VALUE;

            dp[i] = Math.min(fs,sd);
        }

        System.out.println(dp[n-1]);
        
    }
}