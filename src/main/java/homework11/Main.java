package homework11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static Logger logger = Logger.getInstance();

    public static void main(String[] args) throws IOException {

        logger.log( "Начало программы");

        System.out.print("Введите число: ");
        double a =  +  Double.parseDouble(reader.readLine());
        logger.log( "Ввод числа");

        System.out.println("Корень чисел = " +  (Math.sqrt(a)));
        logger.log( "Операция извлечения корня");

        logger.log( "Конец программы");

    }
}

