package ex;

public class Design {
	
	public void AddShape(ShapeFactory factory) {
		Shape shape = factory.createShape();
		shape.getArea();
	}
}
