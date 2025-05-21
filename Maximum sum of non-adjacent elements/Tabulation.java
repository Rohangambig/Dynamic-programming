import java.util.ArrayList;
import java.util.Arrays;

public class Tabulation {
    public static void main(String[] args) {
        ArrayList<Integer> nums =  new ArrayList<>(Arrays.asList(2 ,1 ,4 ,9));
        int size = nums.size()-1;
        int[] dp = new int[size+1];

        dp[0] = nums.get(0);
        int negative = 0;


        for(int i= 1; i <= size; i++) {
            int pick = nums.get(i); 
            if(i > 1) pick += dp[i-2];

            int nonPick = dp[i-1];

            dp[i] = Math.max(pick, nonPick);
        }

        System.out.println(dp[size]);

    }
}