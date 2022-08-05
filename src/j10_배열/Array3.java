package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array3 {

	public static void main(String[] args) {
		String[] names = {"박진관", "조문기", "서재효", "임나영", "전나경"};
		int[] studentYears = {3, 2, 4, 3, 4};
		double[] scores = { 75.9, 80.5, 85.7, 88.3, 78.5 };
		
		for(int i = 0; i < 5; i++) {
			System.out.println(names[i] + "\t" + studentYears[i] + "학년\t" + scores[i] + "점");
		}
		
		Student[] students = new Student[5];
		students[0] = new Student("김준일", 3, 29, "부산", "010-9988-1916");
		
		for(int i = 0; i < 5; i++) {
			if(students[i] == null) {
				continue;
			}
			System.out.println("이름: " + students[i].getName());
		}
	}

}
