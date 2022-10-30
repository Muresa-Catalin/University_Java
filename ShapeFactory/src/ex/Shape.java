package ex;

public interface Shape {
	void getArea();
}

class Circle implements Shape{

	@Override
	public void getArea() {
		System.out.println("I am a circle");
		
	}
	
}

class Square implements Shape{

	@Override
	public void getArea() {
		System.out.println("I am a square");
		
	}
	
}

class Rectangle implements Shape{

	@Override
	public void getArea() {
		System.out.println("I am a rectangle");
		
	}
	
}
