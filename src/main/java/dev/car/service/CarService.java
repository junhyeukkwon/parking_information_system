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

	// 모든 차 조회 검색
	public List<Car> getAllCars() {
		return carDAO.getAllCars();
	}

	// 차 아이디 검색
	public Car getCarByCarId(int carId) {
		return carDAO.getCarByCarId(carId);
	}

	// 차 등록
	public Car insertCar(Car car) {
		return carDAO.insertCar(car);
	}

	// 차 수정
	public Car updateCar(Car car, int carId) {
		return carDAO.updateCar(car, carId);
	}

	// 차 삭제
	public void deleteCar(int carId) {
		carDAO.deleteCar(carId);
	}
}
