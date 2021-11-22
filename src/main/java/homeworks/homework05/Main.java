package homeworks.homework05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int minValue = Integer.MAX_VALUE;
    public static int currentValue = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Enter your number (or exit enter \"-1\"): ");
            int value = Integer.parseInt(reader.readLine());
            if (value == -1) break;

            getMinValue(value);
        }
        System.out.println("Min value : " + minValue);
    }

    private static void getMinValue(int value) {

        currentValue = value % 10;
        if (currentValue < minValue)
            minValue = currentValue;

        currentValue = (value / 10) % 10;
        if (currentValue < minValue)
            minValue = currentValue;

        currentValue = value/100;
        if (currentValue < minValue)
            minValue = currentValue;
    }
}

