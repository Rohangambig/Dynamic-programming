
class Tabulation {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sumArray = 4;

        int size = coins.length - 1;

        int[][] dp = new int[size + 1][sumArray + 1];

        for (int index = 0; index <= size; index++) {
            for (int sum = 0; sum <= sumArray; sum++) {
                if (sum == 0) {
                    dp[index][sum] = 1; 
                }else {
                    int take = 0;
                    if (coins[index] <= sum) {
                        take = dp[index][sum - coins[index]];
                    }

                    int nonTake = 0;
                    if(index > 0) nonTake = dp[index - 1][sum];

                    dp[index][sum] = take + nonTake;
                }
            }
        }

        System.out.println(dp[size][sumArray]);
    }
}
