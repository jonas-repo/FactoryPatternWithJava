package com.factorypattern.model;

public class ShapeFactory {
	
	//user getShape method to get object of type shape
	public Shape getShape(String shapeType)
	{
		if(shapeType == null)
		{
			return null;
		}
		switch(shapeType)
		{
			case "CIRCLE":
				return new Circle();
				
			case "RECTANGLE":
				return new Rectangle();
				
			case "SQUARE":
				return new Square();
			default:
				return null;
		}
		
	}

}
