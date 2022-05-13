package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
public class CarController {

    CarServiceImpl serviceClass;

    public CarController(CarServiceImpl serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping(value = "/car")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {

        List<Car> carList = serviceClass.getCars(count);

        model.addAttribute("carList", carList);
        return "cars";
    }
}
