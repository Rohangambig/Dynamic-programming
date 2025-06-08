
class Recursion {

    public static int findUniquePath(int m,int n) {
        if(m == 0 && n == 0) return 1;
        if(m < 0 || n < 0) return 0;

        int top =  findUniquePath(m-1, n);
        int left = findUniquePath(m,n-1);

        return left + top;
    }

    public static void main(String[] args) {
        int m = 3, n = 7;

        System.out.println(findUniquePath(m-1,n-1));
    }
}