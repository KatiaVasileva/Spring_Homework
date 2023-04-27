package homework.pojo;

public class Pickup extends Transport {

    public Pickup(String brand,
                  String model) {
        super(brand, model);
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль " + super.toString();
    }
}
