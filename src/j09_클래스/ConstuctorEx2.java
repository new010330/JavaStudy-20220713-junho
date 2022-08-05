package j09_클래스;

public class ConstuctorEx2 {
	
	String name;
	int age;
	
	public ConstuctorEx2() {}
	
	public ConstuctorEx2(String name) {
		this.name = name;
	}
	
	public ConstuctorEx2(int age) {
		super();
		this.age = age;
	}


	public ConstuctorEx2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
