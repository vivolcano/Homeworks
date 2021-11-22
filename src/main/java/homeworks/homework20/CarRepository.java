package homeworks.homework20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private String fileName;

    public CarRepository(String fileName) {
        this.fileName = fileName;
    }

    public List<Car> inputCarsInformation() {
        List<Car> cars = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String str;

            while ((str = br.readLine()) != null) {
                String[] parts = str.split("\\|");

                String number = parts[0];
                String model = parts[1];
                String color = parts[2];
                int carMileage = Integer.parseInt(parts[3]);
                int price = Integer.parseInt(parts[4]);

                cars.add(new Car(number, model, color, carMileage, price));

            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return cars;
    }

}
