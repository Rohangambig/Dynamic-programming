class SpaceOptimization {

    public static void main(String[] args) {
        int m = 3, n = 7;

        int[] dp = new int[n];

        for (int i = 0; i < m; i++) {

            int[] temp = new int[n];

            for (int j = 0; j < n; j++) {
                if( i== 0 && j == 0) temp[j] = 1;

                else {
                    temp[j] = dp[j];
                    if (j > 0) {
                        temp[j] += temp[j - 1];
                    }
                }

            }

            dp = temp;

        }

        System.out.println(dp[n - 1]);
    }

}
