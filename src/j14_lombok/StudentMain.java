package j14_lombok;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student(202200001, "김준일", 2, 29);
		
		System.out.println(student2);
	}

}
