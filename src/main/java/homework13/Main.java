package homework13;

import java.util.Arrays;

public class Main {

    public static final int[] ARRAY = new int[] {1, 2, 11, 22, 333, 444, 0, -10, - 20, 1000, 271, 14, 33, 197};
    public static void main(String[] args) {

        int[] flt1 = Sequence.filter(ARRAY, value -> value % 2 == 0 && value != 0);
        System.out.println(Arrays.toString(flt1));

        int[] flt2 = Sequence.filter(ARRAY, value -> sumDigits(value) % 2 == 0 && value != 0);
        System.out.println(Arrays.toString(flt2));

    }

    private static int sumDigits(int i) {

        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }
}
