package ex;

public interface ShapeFactory {
	Shape createShape();
}

class CricleFactory implements ShapeFactory{
	public Shape createShape() {
		return new Circle();
	}
}

class SquareFactory implements ShapeFactory{
	public Shape createShape() {
		return new Square();
	}
}

class RectangleFactory implements ShapeFactory{
	public Shape createShape() {
		return new Rectangle();
	}
}