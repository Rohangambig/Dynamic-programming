
class SpaceOptimization {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 4;

        int size = arr.length;

        boolean[] prev = new boolean[target + 1];
        prev[0] = true;

        for (int i = 1; i < size; i++) {

            boolean[] cur = new boolean[target + 1];
            cur[0] = true;

            for (int j = 1; j < target + 1; j++) {
                boolean nonTake = prev[j];
                boolean take = false;
                if (j >= arr[i]) {
                    take =  prev[j - arr[i] ] ;
                }

                cur[j] = (nonTake || take);
            }

            prev =  cur;
        }


        System.out.println(prev[target]);
    }
}
