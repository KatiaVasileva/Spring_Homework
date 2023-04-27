package homework.config;

import homework.pojo.Bus;
import homework.pojo.Car;
import homework.pojo.Driver;
import homework.pojo.Pickup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("Lada", "Granta");
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("Scania", "A80");
    }

    @Bean(name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup("Hyundai", "Gold");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Никита Мазепин", getCarBean());
    }

    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Юрий Иванов", getBusBean());
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Сергей Карякин", getPickupBean());
    }

}
