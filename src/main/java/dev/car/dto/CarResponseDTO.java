package dev.car.dto;

import org.springframework.stereotype.Repository;

import dev.car.model.Car;

@Repository
public class CarResponseDTO {
	private String msg;
	private Car car;
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
