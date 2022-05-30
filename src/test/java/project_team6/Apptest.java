package project_team6;

import static org.junit.Assert.fail;
import org.junit.Test;
import dev.car.dao.CarDAO;
import dev.car.model.Car;

public class Apptest {
	
	private CarDAO carDAO = new CarDAO();
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void createTest() {
		carDAO.create();
	}
	
	@Test
	public void getAllCarsTest() {
		carDAO.getAllCars();
	}
	
	@Test
	public void getCarByCarIdTest() {
		carDAO.getCarByCarId(1);
	}
	
	@Test
	public void insertCar() {
		carDAO.insertCar(new Car("truck", "123°¡2358","È«±æµ¿", "010-1029-8683"));
	}
	
	@Test
	public void updateCar() {
		carDAO.updateCar(null, 3);
	}
	
	@Test
	public void deleteCar() {
		carDAO.deleteCar(6);
	}

}



