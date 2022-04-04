package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.ServiceClass;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
//    final
    ServiceClass serviceClass;

    public CarController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping(value = "/car")
    public String getCars(@RequestParam(value = "count" , required = false, defaultValue = "0") Integer count, ModelMap model){

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1 ,"Audi",100));
        cars.add(new Car(2 ,"Bentley",200));
        cars.add(new Car(3 ,"Citroen",300));
        cars.add(new Car(4 ,"Dodge",400));
        cars.add(new Car(5 ,"Tesla",500));

        List<Car> carList = serviceClass.getCars(cars,count);

        model.addAttribute("carList", carList);
        return "cars";
    }



}
