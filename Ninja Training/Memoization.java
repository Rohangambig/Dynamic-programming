
import java.util.Arrays;

class Memoization {

    public static int NinjaJump(int index,int last,int[][] arr,int[][] dp) {
        if(dp[index][last] != -1) return dp[index][last];

        if(index == 0) {
            int maximum = 0;
            for(int j = 0;j < 3 ;j ++) {
                if(j != last) 
                    maximum = Math.max(maximum,arr[index][j]);
            }

            return maximum;
        }

        int maximum = 0;
        for(int j = 0 ; j < 3 ;j ++) {
            if(j != last) 
                    maximum = Math.max(maximum,arr[index][j] + NinjaJump(index-1, j, arr, dp));
        }

        return dp[index][last] = maximum;
    }


    public static void main(String[] args) {
        int[][] arr = {
            {18, 11, 19},
            {4, 13, 7},
            {1, 8, 13}
        };

        int size = arr.length;
        int[][] dp = new int[size][3];

        for (int i = 0; i < size; i++) {
            Arrays.fill(dp[i], -1);
        }

        int maximum = 0;
        for (int i = 0; i < 3; i++) {
            int temp = arr[size-1][i] + NinjaJump(size - 2, i, arr, dp);
            maximum = Math.max(maximum, temp);
        }

        System.out.println("Maximum ninja jump is : " + maximum);

    }
}
