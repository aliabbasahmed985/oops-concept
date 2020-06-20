package com.animals;

public class ZooAnimals {
	public String name;
	public int id;
	public boolean barking;
	public boolean sleeping;
	public ZooAnimals(String name, int id, boolean barking, boolean sleeping) {
		super();
		this.name = name;
		this.id = id;
		this.barking = barking;
		this.sleeping = sleeping;
	}
	@Override
	public String toString() {
		return "ZooAnimals [name=" + name + ", id=" + id + ", barking=" + barking + ", sleeping=" + sleeping + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isBarking() {
		return barking;
	}
	public void setBarking(boolean barking) {
		this.barking = barking;
	}
	public boolean isSleeping() {
		return sleeping;
	}
	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}
	
	
	
	

}
