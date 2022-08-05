package j05_입력;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		
		String name;
		int age;
		String address;
		String phone;
		
		Scanner sc = new Scanner(System.in);		
		
//		이름: 김준일								next();
//		나이: 29
//		주소: 부산 동래구 사직동				nextLine();
//		연락처: 010-9988-1916;						next();
		
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("나이: ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("주소: ");
		address = sc.nextLine();
		System.out.print("연락처: ");
		phone = sc.next();
		
		System.out.println("사용자의 이름은 " + name +"이고 나이는 " + age + "살 입니다");
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.print("연락처는 " + phone + " 입니다.");
		
	}
}
