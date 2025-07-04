
class SpaceOptimization {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sumArray = 4;

        int size = coins.length - 1;

        int[] prev = new int[sumArray + 1];
        int[] cur = new int[sumArray + 1];
            

        for (int index = 0; index <= size; index++) {
            
            for (int sum = 0; sum <= sumArray; sum++) {
                if (sum == 0) {
                    cur[sum] = 1; 
                }else {
                    int take = 0;
                    if (coins[index] <= sum) {
                        take = cur[sum - coins[index]];
                    }

                    int nonTake = 0;
                    if(index > 0) nonTake = prev[sum];

                    cur[sum] = take + nonTake;
                }
            }

            prev = cur;
        }

        System.out.println(prev[sumArray]);
    }
}
