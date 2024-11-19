package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.*;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("USSR", "КамАЗ-5320", 1976));
        cars.add(new Car("Germany", "Volkswagen Beetle", 1967));
        cars.add(new Car("United Kingdom", "Bentley S1 Continental", 1955));
        cars.add(new Car("Japan", "Honda Accord", 1990));
        cars.add(new Car("South Korea", "Seo Changbin", 1999));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
