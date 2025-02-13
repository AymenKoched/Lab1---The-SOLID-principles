package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager
{

    private final CarRepository carRepository;
    private final CarEvaluator carEvaluator;
    private final CarFormatter carFormatter;

    public CarManager(CarRepository carRepository, CarEvaluator carEvaluator, CarFormatter carFormatter) {
        this.carRepository = carRepository;
        this.carEvaluator = carEvaluator;
        this.carFormatter = carFormatter;
    }

    public Car getCarById(final String carId) {
        return carRepository.getCarById(carId);
    }


    public String getCarsNames() {
        List<Car> cars = carRepository.getAllCars();
        return carFormatter.formatCarsNames(cars);
    }

    public Car getBestCar() {
        List<Car> cars = carRepository.getAllCars();
        return carEvaluator.getBestCar(cars);
    }
}
