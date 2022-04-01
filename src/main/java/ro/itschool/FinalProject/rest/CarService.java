package ro.itschool.FinalProject.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.itschool.FinalProject.entity.BmwCar;
import ro.itschool.FinalProject.repository.CarRepository;

import java.util.List;
@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public List<BmwCar> findByKeyword(String keyword){
        return carRepository.findByKeyword(keyword);
    }
}
