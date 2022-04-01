package ro.itschool.FinalProject.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.itschool.FinalProject.entity.BmwCar;
import ro.itschool.FinalProject.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class CarController {

    @Autowired
    CarRepository carRepository;


    @PostMapping
    public  List<BmwCar> savebmwCars (@RequestBody List<BmwCar> bmwCars) {
        return carRepository.saveAll(bmwCars);
    }
    @GetMapping(value = "/all")
    public List<BmwCar> getAllCars() {
     return carRepository.findAll();
    }


    @GetMapping(value = "/{id}")
        public ResponseEntity<?> getOneById(@PathVariable Long id){
            final Optional<BmwCar> bmwCar = carRepository.findById(id);
            if(bmwCar.isEmpty())
         return  new ResponseEntity<>("This car doesn't exist in the showroom " + id,  HttpStatus.NOT_FOUND);
            else
          return  new ResponseEntity<>(HttpStatus.FOUND);
        }

    @PostMapping(value =  "/create-car")
    public void createCar(@RequestBody  BmwCar bmwCar) {
        carRepository.save(bmwCar);
    }

    @DeleteMapping(value = "/delete-car/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id){
        carRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value= "/update-car/{id}")
    public ResponseEntity<Void> updateCar(@PathVariable Long id, @RequestBody BmwCar bmwCar) {
        carRepository.update(bmwCar.getModel(), id);
        return ResponseEntity.ok().build();
    }


    }
