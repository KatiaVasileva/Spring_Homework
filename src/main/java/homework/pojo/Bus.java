package homework.pojo;

public class Bus extends Transport {

    public Bus(String brand,
               String model) {
        super(brand, model);
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }
}
