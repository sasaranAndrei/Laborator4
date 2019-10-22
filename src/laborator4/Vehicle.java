package laborator4;
import java.awt.Color;
public class Vehicle {
	private String brand;
	private Color color;
	private Integer currentSpeed;
	private Integer currentGear;
	private Integer maximumSpeed;
	private Driver driver;
	
	public Vehicle () {
		System.out.println("A new vehicle has been created");
	}
	
	public Vehicle (String brand, Color color) {
		this.brand = brand;
		this.color = color;
		System.out.println("A new vehicle has been created with color : " + color.toString());
	}
	
	public String getBrand () {
		return this.brand;
	}
	
	public void setBrand (String brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Integer getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(Integer currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public void setCurrentSpeed(Double currentSpeed) {
		Integer i = new Integer (currentSpeed.intValue());
		this.currentSpeed = i; } // metoda suprascrisa

	public Integer getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(Integer currentGear) {
		this.currentGear = currentGear;
	}

	public Integer getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(Integer maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	
	public void accelerate (Integer noOfKm) {
		if ((this.currentSpeed + noOfKm) < this.maximumSpeed) {
			this.currentSpeed += noOfKm;
		}
		else {
			System.out.println("Eroare");
		}
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public void decelerate (Integer noOfKm) {
		this.accelerate(-noOfKm);
	}

	public void changeGear (Integer nextGear){
		this.setCurrentGear(nextGear);
	}

	public void stop (){
		this.setCurrentSpeed(0);
	}
	
	
	
}
