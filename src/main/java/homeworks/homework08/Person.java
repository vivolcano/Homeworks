package homeworks.homework08;

public class Person implements Comparable<Person> {

    private String name;
    private double weight;

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {

        this.weight = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if(this.getWeight() < o.getWeight())
        {
            return -1;
        }
        else if(this.getWeight() >o.getWeight())
        {
            return 1;
        }
        return 0;
    }

}
