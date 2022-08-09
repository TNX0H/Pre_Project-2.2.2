package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Babaha", 1412, 1952));
        carList.add(new Car("Elm", 57988, 4587));
        carList.add(new Car("OB", 4785, 7688));
        carList.add(new Car("IS", 34761, 3154));
        carList.add(new Car("MS", 9317, 3597));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}