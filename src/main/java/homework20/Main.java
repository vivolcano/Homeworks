package homework20;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        CarRepository carRepository =
                new CarRepository("/Users/admin/Desktop/Homeworks/src/main/resources/homework20_cars.txt");


        // 1) Номера всех автомобилей, имеющих черный цвет или нулевой пробег
        carRepository.inputCarsInformation().stream()
                .filter(car -> car.getColor().equalsIgnoreCase("black") || car.getCarMileage() == 0)
                .map(Car::getNumber)
                .forEach(System.out::println);

        // 2) Количество уникальных моделей в ценовом диапазоне от 700 до 800 тыс.
        System.out.println(carRepository.inputCarsInformation().stream()
                .filter(car -> 700_000 <= car.getPrice())
                .filter(car -> car.getPrice() <= 800_000)
                .map(Car::getModel)
                .distinct()
                .count());

        // 3) Цвет автомобиля с минимальной стоимостью. // min + map
        System.out.println(carRepository.inputCarsInformation().stream()
                .min(Comparator.comparing(Car::getPrice))
                .map(Car::getColor));

        // 4) Средняя стоимость Camry
        System.out.println(carRepository.inputCarsInformation().stream()
                .filter(car -> car.getModel().equalsIgnoreCase("camry"))
                .mapToInt(Car::getPrice)
                .summaryStatistics()
                .getAverage());
    }
}
