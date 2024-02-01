package programming_skills;

public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(1.0000000000001, -2147483648));
    }

    public static double myPow(double x, int n) {
        if (x == 1.0) return 1.0;
        if (x == -1.0) return n % 2 == 0 ? 1.0 : -1.0;

        double r = 1;

        if (n < 0) {
            x = 1 / x;

            if (n == Integer.MIN_VALUE){
                n = Integer.MAX_VALUE;
            } else {
                n *= -1;
            }


        }

        for (int i = 0; i < n; i++) {
            r *= x;

            System.out.println(r);
            if (r == 0.0){
                return 0;
            }
        }

        return r;
    }
}
