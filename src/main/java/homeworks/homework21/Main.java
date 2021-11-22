package homeworks.homework21;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int array[];
    public static int sums[] = new int[1];
    public static int sum;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        array = new int[scanner.nextInt()];

        createRandomArrayAndPrintElementSum();

       Thread firstThread = new SumThread(0, array.length, 0);
       firstThread.start();
       firstThread.interrupt();

       System.out.println(Arrays.toString(sums));

//        int byThreadSum = 0;
//
//        for (int i = 0; i < threadsCount; i++) {
//            byThreadSum += sums[i];
//        }
//
//        System.out.println(byThreadSum);
    }

    private static void createRandomArrayAndPrintElementSum() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Сумма элементов в массиве = " + Arrays.stream(array).sum());
    }
}

