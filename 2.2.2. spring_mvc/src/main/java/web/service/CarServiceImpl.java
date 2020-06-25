package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();
        Car bmw = new Car(1, "BMW", "X7");
        Car subaru = new Car(2, "Subaru", "Impreza");
        Car porsche = new Car(3, "Porsche", "Panamera");
        carList.add(bmw);
        carList.add(subaru);
        carList.add(porsche);
        return carList;
    }
}
