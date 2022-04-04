package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceClass {

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "Audi", 100));
        cars.add(new Car(2, "Bentley", 200));
        cars.add(new Car(3, "Citroen", 300));
        cars.add(new Car(4, "Dodge", 400));
        cars.add(new Car(5, "Tesla", 500));

        return cars;
    }

    public List<Car> getCars(List<Car> cars, int num) {
        return num == 0 ? cars : cars.stream().limit(num).collect(Collectors.toList());
    }
}
