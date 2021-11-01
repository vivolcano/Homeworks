package homework07;

import java.util.Random;

public class Main {

    private static final int ARR_SIZE = 201; // размер массива
    private static final int NEGATIVE_VALUE = 100; // кол-во отрицательных числе в массиве

    private static int[] values = new int[ARR_SIZE]; // массив с числами на "вход"
    private static int[] counts = new int[ARR_SIZE]; // счетчик для подсчета сколько раз
    // встречается каждое из чисел в полседовательности

    private static int minValue = Integer.MAX_VALUE; // начальное значение для определения
    // минимального значения счетчика

    public static void main(String[] args) {

        // создание массива из рандомных чисел
        int[] randArr = makeRandomArr();

        // поиск числа, которе присутствует в последовательности минимальное количество раз и вывод на экран
        printMinValuesInStream(randArr);

    }

    private static void printMinValuesInStream(int[] array) {

        // заполнение счетчика для каждого числа
        for (int j : array)
            counts[NEGATIVE_VALUE + j]++;

        // поиск минимального встречающегося числа в последовательности
        for (int value : counts) {
            if (value < minValue && value != 0)
                minValue = value;
        }

        // вывод на экран результата
        System.out.println("Минимально встречающиеся числа в последовательности: ");

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == minValue)
                System.out.print((i - NEGATIVE_VALUE) + " ");
        }
    }

    private static int[] makeRandomArr() {

        Random random = new Random();

        for (int i = 0; i < values.length - 1; i++) {
            values[i] = random.nextInt(ARR_SIZE) - NEGATIVE_VALUE;
        }

        values[values.length-1] = -1;
        return values;
    }

}

