package com.perfume.designpattern.factory;

public class FactoryPattern {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = ShapeFactory.getInstance();
		shapeFactory.getShape("circle").draw();
		shapeFactory.getShape("Rectangle").draw();
		shapeFactory.getShape("Square").draw();
	}

}

class ShapeFactory {
	
	private static ShapeFactory shapeFactory;
	
	private ShapeFactory() {}
	
	public static ShapeFactory getInstance() {
		if(shapeFactory == null) {
			synchronized(ShapeFactory.class) {
				if(shapeFactory == null) {
					shapeFactory = new ShapeFactory();
				}
			}
		}
		return shapeFactory;
	}
	
	public Shape getShape(String type) {
		if(type.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if(type.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if(type.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
	
}

interface Shape {
	
	void draw();
	
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("This is a circle");
	}

}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("This is a rectangle");
	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("This is a square");
	}

}