package dev.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.car.dao.CarDAO;
import dev.car.model.Car;

@Service
public class CarService {
	@Autowired
	CarDAO carDAO;

	// ��� �� ��ȸ �˻�
	public List<Car> getAllCars() {
		return carDAO.getAllCars();
	}

	// �� ���̵� �˻�
	public Car getCarByCarId(int carId) {
		return carDAO.getCarByCarId(carId);
	}

	// �� ���
	public Car insertCar(Car car) {
		return carDAO.insertCar(car);
	}

	// �� ����
	public Car updateCar(Car car, int carId) {
		return carDAO.updateCar(car, carId);
	}

	// �� ����
	public void deleteCar(int carId) {
		carDAO.deleteCar(carId);
	}
}
