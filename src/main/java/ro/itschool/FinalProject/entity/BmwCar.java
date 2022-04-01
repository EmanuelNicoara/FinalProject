package ro.itschool.FinalProject.entity;

import lombok.*;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BmwCar {
    @Id
    @GeneratedValue
    private Long id;

    private String bodyType;

    private String model;

    private String fuelType;

    private String gearBox;

    private long yearOfFabrication;

    private String motorCapacity;

    private long horsePower;

    private String colour;

    public BmwCar(String model) {
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public long getYearOfFabrication() {
        return yearOfFabrication;
    }

    public void setYearOfFabrication(long yearOfFabrication) {
        this.yearOfFabrication = yearOfFabrication;
    }

    public String getMotorCapacity() {
        return motorCapacity;
    }

    public void setMotorCapacity(String motorCapacity) {
        this.motorCapacity = motorCapacity;
    }

    public long getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(long horsePower) {
        this.horsePower = horsePower;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
