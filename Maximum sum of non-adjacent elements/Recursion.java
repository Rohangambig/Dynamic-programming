public class Recursion {

    public static int MaximumSum(int[] nums,int size) {
        if(size == 0) return nums[size];
        if(size < 0) return 0;

        int pick =  nums[size] + MaximumSum(nums, size-2);
        int nonPick = MaximumSum(nums, size-1);

        return Math.max(pick,nonPick);
    }
    public static void main(String[] args) {
        int[] nums = {2 ,1 ,4 ,9};
        int size = nums.length;

        System.out.println("Maximum sum without Adjacent : "+ MaximumSum(nums,size-1));
    }
}