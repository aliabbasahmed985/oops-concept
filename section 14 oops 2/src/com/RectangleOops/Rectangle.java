package com.RectangleOops;

public class Rectangle {
	private int lenght;
	private int width;
	public Rectangle(int lenght, int width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int area() {
		return lenght*width;
	}
	public int perimeter() {
		return 2*(lenght+width);
	}
	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", width=" + width + ", area()=" + area() + ", perimeter()="
				+ perimeter() + "]";
	}
	
	
	
	
	
	

}
