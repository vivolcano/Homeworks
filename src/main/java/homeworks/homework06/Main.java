package homeworks.homework06;

import java.util.Arrays;

public class Main {

    final static int [] ARR = new int[] {34, 0, 0, 14, 15, 0, 18, 0, 0, 1, 2};


    public static void main(String[] args) {

        // 1 задача
        int index = getValueIndex(ARR, 5);
        System.out.println(index != -1 ? "index = " + index : index + ", not found index \n");

        // 2 задача
        System.out.println(Arrays.toString(ARR));
        System.out.println(Arrays.toString(changeArr(ARR)));

    }

    private static int [] changeArr(int[] arr) {

        int [] result = new int[arr.length];
        int count = 0;

        for (int j : arr) {
            if (j != 0) {
                result[count] = j;
                count++;
            }
        }
        return result;
    }

    private static int getValueIndex(int[] arr, int value) {

        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                result = i;
        }

        return result;
    }
}
