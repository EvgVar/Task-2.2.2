package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private static long CAR_ID;
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(++CAR_ID, "Tucson NX4 Diesel", 2.0));
        carList.add(new Car(++CAR_ID, "RAV4 4WD", 2.5));
        carList.add(new Car(++CAR_ID, "Tiguan Turbo", 1.4));
        carList.add(new Car(++CAR_ID, "CX5", 2.0));
        carList.add(new Car(++CAR_ID, "Outlander", 2.5));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size()) {
            return carList;
        } else return carList.stream().limit(count).collect(Collectors.toList());
    }
}
