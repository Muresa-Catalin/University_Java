class Phone{
	String model;
	
	Phone(){
		model = "NaN";
		System.out.println("S-a creat modelul " + model);
	}
	
	Phone(String arg){
		model = arg;
		System.out.println("S-a creat modelul " + model);
	}
}


public class Problema9 {

	public static void main(String[] args) {
		Phone samsung = new Phone("Samsung");
		Phone nokia = new Phone();

	}

}
