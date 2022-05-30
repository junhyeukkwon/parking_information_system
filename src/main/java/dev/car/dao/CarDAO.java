package dev.car.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import dev.car.model.Car;

@Repository
public class CarDAO {
	// car������ ����
	public void create() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_team6");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		Car car1 = new Car("SUV", "123��2333", "������", "010-4035-8233");
		em.persist(car1);

		Car car2 = new Car("RV", "423��4728", "������", "010-1223-2234");
		em.persist(car2);

		Car car3 = new Car("Wagon", "185��5894", "��ü��", "010-2345-5643");
		em.persist(car3);

		Car car41 = new Car("Compact_Car", "827��1290", "������", "010-6342-8797");
		em.persist(car41);

		Car car5 = new Car("Sedan", "111��1293", "Ȳ����", "010-0183-1839");
		em.persist(car5);

		tx.commit();
	}

	// ��ü ���� ��ȸ
	public List<Car> getAllCars() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_team6");
		EntityManager em = emf.createEntityManager();

		List<Car> cars = new ArrayList<>();

		for (int id = 1; id < 10; id++) {
			cars.add(em.find(Car.class, id));
		}
		return cars;
	}

	// �ϳ��� ���� ��ȸ
	public Car getCarByCarId(int carId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_team6");
		EntityManager em = emf.createEntityManager();

		Car car = em.find(Car.class, carId);
		System.out.println(car);
		return car;
	}

	// ���� ���
	public Car insertCar(Car newCar) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_team6");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		Car car = new Car();
		car.setId(newCar.getId());
		car.setName(newCar.getName());
		car.setPhoneNum(newCar.getPhoneNum());
		car.setTypeof(newCar.getTypeof());
		car.setCarNumber(newCar.getCarNumber());
		em.persist(car);
		tx.commit();

		return car;
	}

	// ���� ���� ���� ���
	public Car updateCar(Car car, int carId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_team6");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		Car updatedCar = em.find(Car.class, carId);
		updatedCar.setLocation(car.getLocation());
		tx.commit();

		return updatedCar;
	}

	// ����(���� ����)
	public void deleteCar(int carId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_team6");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		Car car = em.find(Car.class, carId);
		em.remove(car);

		tx.commit();
	}

}
