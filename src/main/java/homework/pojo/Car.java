package homework.pojo;

public class Car extends Transport {

    public Car(String brand,
               String model) {
        super(brand, model);
    }

    @Override
    public String toString() {
            return "Легковой автомобиль " + super.toString();
    }
}

