
class Tabulation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 4;

        int size = arr.length;

        boolean[][] dp = new boolean[size][target + 1];

        for (int index = 0; index < size; index++) {
            dp[index][0] = true;
        }

        dp[0][arr[0]] = true;

        for (int i = 1; i < size; i++) {
            for (int j = 1; j < target + 1; j++) {
                boolean nonTake = dp[i - 1][j];
                boolean take = false;
                if (j >= arr[i]) {
                    take =  dp[i-1][j - arr[i] ] ;
                }

                dp[i][j] = (nonTake || take);
            }
        }


        System.out.println(dp[size-1][target]);
    }
}
