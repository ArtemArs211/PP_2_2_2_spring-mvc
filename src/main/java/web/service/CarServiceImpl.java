package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList;

    public CarServiceImpl() {
        this.carList = new ArrayList<>();

        carList.add(new Car("Geely", "grey", 2024));
        carList.add(new Car("Honda", "red", 2004));
        carList.add(new Car("Mercedes", "white", 2014));
        carList.add(new Car("BMW", "black", 2021));
        carList.add(new Car("Toyota", "blue", 2018));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count <= 0  || count > carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}
