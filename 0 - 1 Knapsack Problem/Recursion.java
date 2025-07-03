class Recursion {

    public static int  knapsack(int[] val,int[] wt,int index, int capacity) {
        if(capacity <= 0) return 0;
        if(index == 0) {
            if(capacity >= wt[0]) return val[0];
            return 0;
        }

        int take = 0;
        if(capacity >= wt[index])
            take = val[index] + knapsack(val, wt, index-1, capacity - wt[index]);

        int nonTake = knapsack(val, wt, index-1, capacity);

        return Math.max(take,nonTake);
    }
    public static void main(String[] args){
        int capacity = 4;
        int val[] = {1, 2, 3};
        int wt[] = {4,5,1};

        int size = val.length-1;

        System.out.println(knapsack(val,wt,size,capacity));

    }
}