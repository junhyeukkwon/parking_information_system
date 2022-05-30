package dev.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.car.model.Car;
import dev.car.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {
	@Autowired
	private CarService carService;

	// 모든 차량 조회
	@GetMapping("")
	public List<Car> getAllUser() {
		return carService.getAllCars();
	}

	// 하나의 차량 조회
	@GetMapping("/{carId}")
	public Car getCarByCarId(@PathVariable("carId") int carId) {
		return carService.getCarByCarId(carId);
	}

	// 차량 등록
	@PostMapping("/regist")
	public Car insertCar(@RequestBody Car car) {
		return carService.insertCar(car);
	}

	// 정보 수정
	@PatchMapping("/{carId}")
	public Car updateCar(@RequestBody Car car, @PathVariable("carId") int carId) {
		return carService.updateCar(car, carId);
	}

	// 차량 삭제조회
	@DeleteMapping("/{carId}")
	public void deleteCar(@PathVariable("carId") int carId) {
		carService.deleteCar(carId);
	}
}
