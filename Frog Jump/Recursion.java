
class Recursion {

    int FrogJump(int n,int[] heights) {
        if(n == 0) return 0;
        if(n < 0) return Integer.MAX_VALUE;

        int left = Integer.MAX_VALUE, right =  Integer.MAX_VALUE;
        if(n - 1 >= 0) left = Math.abs(heights[n] - heights[n-1]) + FrogJump(n-1, heights);
        if(n - 2 >= 0) right = Math.abs(heights[n] - heights[n-2]) + FrogJump(n-2, heights);

        return Math.min(left, right);
    }
    public static void main(String args[]) {
        int[] heights = {7 ,5 ,5 ,8 ,4 ,9 ,1 ,1, 10};
        int n =  heights.length;

        Recursion obj =  new Recursion();

        System.out.println(obj.FrogJump(n-1,heights));
    }
}