
class Recursion {

    public int NinjaJump(int day, int last, int[][] arr) {
        if (day == 0) {
            int maximum = 0;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    int temp = arr[day][i];
                    maximum = Math.max(maximum, temp);
                }
            }

            return maximum;
        }

        int maximum = 0;
        for (int i = 0; i < 3; i++) {
            if (i != last) {
                int temp = arr[day][i] + NinjaJump(day - 1, i, arr);
                maximum = Math.max(maximum, temp);
            }
        }

        return maximum;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {18, 11, 19},
            {4, 13, 7},
            {1, 8, 13}
        };

        int size = arr.length - 1;
        int maximum = 0;

        Recursion obj = new Recursion();

        for (int i = 0; i < 3; i++) {
            int temp = arr[size][i] + obj.NinjaJump(size - 1, i, arr);
            maximum = Math.max(maximum, temp);
        }

        System.out.println("Maximum ninja jump is : " + maximum);
    }
}
