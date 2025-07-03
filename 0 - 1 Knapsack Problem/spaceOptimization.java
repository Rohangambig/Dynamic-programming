
class spaceOptimization {

    public static void main(String[] args){
        int W = 4;
        int val[] = {1, 2, 3};
        int wt[] = {4,5,1};

        int size = val.length-1;
        int[] prev = new int[W+1];

        for(int i = 0 ; i <= W; i++) {
            if(i >= wt[0]) prev[i] = val[0];
        }

        for(int index = 1; index <= size; index++) {

            int[] cur = new int[W+1];
            for(int capacity = 0 ; capacity <= W; capacity++) {
                int take = 0;
                if(capacity >= wt[index])
                    take = val[index] + prev[capacity - wt[index]];

                int nonTake = prev[capacity];

                cur[capacity] = Math.max(take,nonTake);
            }

            prev = cur;
        }

        System.out.println(prev[W]);

    }
}