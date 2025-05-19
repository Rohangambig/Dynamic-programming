public class Recursion {

    public static int FropJump(int size,int[] heights,int k) {
        if(size == 0) return 0;
        int minimumJump = Integer.MAX_VALUE;

        for(int j = 1;j <= k ;j ++) {
            if(size - j >= 0) {
                int jump = FropJump(size-j, heights, k) + Math.abs(heights[size] - heights[size-j]);
                minimumJump = Math.min(jump, minimumJump);
            }

            else {
                break;
            }
        }
        return minimumJump;
    }
    public static void main(String[] args) {
        int heights[] = {10, 5, 20, 0, 15};
        int size = heights.length;
        int k = 2;

        System.out.println(FropJump(size-1,heights,k));
    }
}