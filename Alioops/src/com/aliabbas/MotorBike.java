package com.aliabbas;

public class MotorBike {

	public String name;
	public int speed;
	public String brake;
	@Override
	public String toString() {
		return "MotorBike [name=" + name + ", speed=" + speed + ", brake=" + brake + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getBrake() {
		return brake;
	}
	public void setBrake(String brake) {
		this.brake = brake;
	}
	public MotorBike(String name, int speed, String brake) {
		super();
		this.name = name;
		this.speed = speed;
		this.brake = brake;
	}
	
	

}
