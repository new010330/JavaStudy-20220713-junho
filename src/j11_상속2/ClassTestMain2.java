package j11_상속2;

public class ClassTestMain2 {

	public static void main(String[] args) {
		int num = 10;
		int[] numbers = new int[3];
		numbers[0] = num;
		
		System.out.println(numbers[0]);
		
		ClassA b = new ClassB();
		ClassA[] arrayA = new ClassA[2];
		arrayA[0] = b;
		arrayA[1] = new ClassC();
		
		arrayA[0].printInfo();
		arrayA[1].printInfo();
		
	}

}
