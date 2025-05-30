
class Recursion {
     public static int maxRecursion(int size,int arr[]) {
        if(size < 0) return 0;
        if(size == 0) return arr[size];

        int pick = arr[size] + maxRecursion(size-2,arr);
        int nonPick = maxRecursion(size-1,arr);

        return Math.max(pick,nonPick);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int size = nums.length;   

        int arr1[] = new int[size-1];
        int arr2[] = new int[size-1];

        int k = 0;
        for(int i = 0 ; i < size; i ++ ) {
            if( i > 0) {
                arr2[k] = nums[i];
                k += 1;
            }

            if( i < size-1) arr1[i] = nums[i];
        }

        System.out.println(Math.max( maxRecursion(size-2,arr1) , maxRecursion(size-2,arr2)) );

    }
}