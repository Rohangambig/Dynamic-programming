


class Tabulation {

    public static int MinimumFallingSum(int[][] arr, int r, int c, int size, int[][] dp) {
        if (r == size - 1) {
            return arr[r][c];
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (i != c) {
                result = Math.min(result, arr[r][c] + MinimumFallingSum(arr, r + 1, i, size, dp));
            }
        }

        return dp[r][c] = result;
    }

    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
        };

        int size = arr.length;

        int[][] dp = new int[size][size];

        for (int i = 0; i < size; i++) {
            dp[size - 1][i] = arr[size - 1][i];
        }

        for (int i = size - 2; i >= 0; i--) {
           

            for (int j = 0; j < size; j++) {
                int result = Integer.MAX_VALUE;

                for (int k = 0; k < size; k++) {
                    if (j != k) {
                        result = Math.min(result, arr[i][j] + dp[i + 1][k]);
                    }
                }

                 dp[i][j] = result;
            }

        }
        int minimum =  Integer.MAX_VALUE;

        for(int i =  0; i< size ; i++)
            minimum = Math.min(minimum, dp[0][i]);
        System.out.println(minimum);
    }
}
