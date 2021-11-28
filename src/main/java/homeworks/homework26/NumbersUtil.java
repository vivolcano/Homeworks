package homeworks.homework26;

public class NumbersUtil {

    public static int gcd(int a, int b) {
        if (a < 0 || b < 0)
            throw new ArithmeticException("negative number");

        return b == 0 ? a : gcd(b,a % b);
    }
}
