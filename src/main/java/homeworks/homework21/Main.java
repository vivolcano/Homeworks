package homeworks.homework21;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int array[];
    public static int sums[];
    public static int sum;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int numbersCount = scanner.nextInt();

        System.out.print("Enter number of threads: ");
        int threadsCount = scanner.nextInt();

        array = new int[numbersCount];
        sums = new int[threadsCount];

        createRandomArray(random);

        int realSum = Arrays.stream(array).sum();
        System.out.println("single threading = " + realSum);

        int threadSum = getByThreadSum(numbersCount, threadsCount, array);
        System.out.println("multithreading sum = " + threadSum);

    }

    public static int getByThreadSum(int numbersCount, int threadsCount, int[] array) {
        int byThreadSum = 0;
        int numberOfElementsInOneThread = (int)Math.ceil((double) numbersCount / (double) threadsCount);
        int[] sums = new int[threadsCount];
        for (int i = 0; i < sums.length; i++) {
            Thread sumThread =
                    new SumThread(i * numberOfElementsInOneThread, (i + 1) * numberOfElementsInOneThread -1, array);
            sumThread.start();
            try {
                sumThread.join();
            } catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }

            sums[i] = sum;
            byThreadSum += sums[i];
        }
        return byThreadSum;
    }

    private static void createRandomArray(Random random) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

}

