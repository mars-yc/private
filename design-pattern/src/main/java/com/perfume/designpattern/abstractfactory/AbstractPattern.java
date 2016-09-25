package com.perfume.designpattern.abstractfactory;

/**
 * Not yet finish.<br>
 * will keep on tmr
 * @author Administrator
 *
 */
public class AbstractPattern {
	
	public static void main(String[] args) {
	
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape1 = shapeFactory.getShape("circle");
		Shape shape2 = shapeFactory.getShape("rectangle");
		
		shape1.draw();
		shape2.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color1 = colorFactory.getColor("red");
		Color color2 = colorFactory.getColor("green");
		
		color1.fill();
		color2.fill();
		
	}
	
}

class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
	
}

class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}

}

class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		return null;
	}

}

abstract class AbstractFactory {

	abstract Color getColor(String color);

	abstract Shape getShape(String shape);

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

interface Color {

	void fill();

}

class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Red");
	}

}

class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Green");
	}

}