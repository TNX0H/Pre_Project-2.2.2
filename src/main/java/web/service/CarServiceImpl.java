package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> carList(Integer counter) {
        List<Car> carList;
        {
            carList = new ArrayList<>();
            carList.add(new Car("Babaha", 1412, 1952));
            carList.add(new Car("Elm", 57988, 4587));
            carList.add(new Car("OB", 4785, 7688));
            carList.add(new Car("IS", 34761, 3154));
            carList.add(new Car("MS", 9317, 3597));
        }
        return carList.stream().limit(counter).collect(Collectors.toList());
    }
}
