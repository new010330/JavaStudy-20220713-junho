package j09_클래스.생성자;

public class Car {
	String company;
	String model;
	String color;
	
	public Car() {
		System.out.println("기본생성자");
	}
	
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}

	void showCarInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println();
		
	}
}
