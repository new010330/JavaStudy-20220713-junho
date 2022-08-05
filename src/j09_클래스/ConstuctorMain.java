package j09_클래스;

public class ConstuctorMain {

	public static void main(String[] args) {
		ConstuctorEx constuctorEx1 = new ConstuctorEx();
		ConstuctorEx constuctorEx2 = new ConstuctorEx("김준일");
		ConstuctorEx constuctorEx3 = new ConstuctorEx(29);
		ConstuctorEx constuctorEx4 = new ConstuctorEx("김준일", 29);
		
		System.out.println(constuctorEx2.name);
		
		
	}
}
