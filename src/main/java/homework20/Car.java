package homework20;

public class Car {
    private String number;
    private String model;
    private String color;
    private int carMileage;
    private int price;

    public Car(String number, String model, String color, int carMileage, int price) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.carMileage = carMileage;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(int carMileage) {
        this.carMileage = carMileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
