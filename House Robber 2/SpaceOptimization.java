
class SpaceOptimization {

    public static int HouseRobber(int size,int[] arr) {
        int prev1 = arr[0];
        int prev2 = 0;

        for(int i = 1; i < size; i ++) {
            int take = arr[i];
            if(i > 1) take += prev1; 
            int nonTake = prev2;

            prev2 = prev1;
            prev1 = Math.max(nonTake,take);
        }

        return prev1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int size = nums.length;   

        int arr1[] = new int[size-1];
        int arr2[] = new int[size-1];
        int dp1[] = new int[size-1];
        int dp2[] = new int[size-1];

         int k = 0;
        for(int i = 0 ; i < size; i ++ ) {
            if( i > 0) {
                arr2[k] = nums[i];
                k += 1;
            }

            if( i < size-1) arr1[i] = nums[i];
        }


        int num1 = HouseRobber(size-1 ,arr1);
        int num2 = HouseRobber(size-1, arr2);

        System.out.println(Math.max(num1,num2));        
    }
}