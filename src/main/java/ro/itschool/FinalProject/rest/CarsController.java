package ro.itschool.FinalProject.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.itschool.FinalProject.repository.CarRepository;

@Controller
public class CarsController {

    @Autowired
    CarRepository carRepository;
    @Autowired
    private CarService carService;
    @GetMapping("/cars")
    public String showCarsList(Model model, String keyword) {
        if(keyword != null){
            model.addAttribute("bmwCars", carService.findByKeyword(keyword));
        }
        else {
            model.addAttribute("bmwCars", carRepository.findAll());
        }
        return "cars.html";

    }
    @GetMapping("/car1")
    public String showCar1(){
        return "car1";
    }
    @GetMapping("/car2")
    public String showCar2(){
        return "car2";
    }
    @GetMapping("/car3")
    public String showCar3(){
        return "car3";
    }
    @GetMapping("/car4")
    public String showCar4(){
        return "car4";
    }
    @GetMapping("/car5")
    public String showCar5(){
        return "car5";
    }
    @GetMapping("/car6")
    public String showCar6(){
        return "car6";
    }
    @GetMapping("/car7")
    public String showCar7(){
        return "car7";
    }
    @GetMapping("/car8")
    public String showCar8(){
        return "car8";
    }
    @GetMapping("/car9")
    public String showCar9(){
        return "car9";
    }
    @GetMapping("/car10")
    public String showCar10(){
        return "car10";
    }
    @GetMapping("/car11")
    public String showCar11(){
        return "car11";
    }
    @GetMapping("/car12")
    public String showCar12(){
        return "car12";
    }

}