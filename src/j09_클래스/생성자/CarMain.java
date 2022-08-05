package j09_클래스.생성자;

public class CarMain {
	
	public static void main(String[] args) {
		Car c1 = new Car("현대자동차", "쏘나타", "화이트");
		Car c2 = new Car("기아", "k5", "블랙");
		Car c3 = new Car("현대자동차", "아반떼", "그레이");
		
		c1.showCarInfo();
		c2.showCarInfo();
		c3.showCarInfo();
	}
}
