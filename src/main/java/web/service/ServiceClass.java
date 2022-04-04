package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceClass {
    public List<Car> getCars (List<Car> cars , int num){
        return  num==0?cars:cars.stream().limit(num).collect(Collectors.toList());
    }
}
