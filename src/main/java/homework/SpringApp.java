package homework;

import homework.config.AppConfig;
import homework.pojo.Bus;
import homework.pojo.Car;
import homework.pojo.Driver;
import homework.pojo.Pickup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean("car", Car.class);
        Bus bus = context.getBean("bus", Bus.class);
        Pickup pickup = context.getBean("pickup", Pickup.class);

        System.out.println(car + " готов к работе");
        System.out.println(bus + " готов к работе");
        System.out.println(pickup + " готов к работе");

        System.out.println();

        Driver driver1 = context.getBean("driver1", Driver.class);
        Driver driver2 = context.getBean("driver2", Driver.class);
        Driver driver3 = context.getBean("driver3", Driver.class);

        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);
    }
}
