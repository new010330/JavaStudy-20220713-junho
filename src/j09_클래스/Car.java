package j09_클래스;

public class Car {
	String company;
	String model;
	String color;
	
	Car() {
		// 생성자는 무조건 주소값을 리턴한다.
		System.out.println("기본생성자");
	}
	
	void showCarInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println();
		
	}

}
