package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class UserArrayList2 {
	private List<User> userList;
	private Scanner scanner;
	
	public UserArrayList2() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {
		String username = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		
		System.out.print("이름: ");
		name = scanner.nextLine();
		
		System.out.print("이메일: ");
		email = scanner.nextLine();
		
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		
		userList.add(user);
	}
	
	public void removeUser() {
		String username = null;
		String password = null;
		
		System.out.println("아이디");
		username = scanner.nextLine();
		
		for(User user : userList) {
			if(user.getUsername().equals(username)) {
				System.out.println("비밀번호");
				password = scanner.nextLine();
				if(user.getPassword().equals(password)) {
					userList.remove(user);
					System.out.println(user);
					System.out.println("삭제 완료");
					return;
				}
				else {
					System.out.println("비밀번호가 일치하지 않습니다.");					
				}
			}
		}
		System.out.println("사용자를 찾을 수 없습니다.");
	}
	
	public void printUserList() {
		for(User user : userList) {
			System.out.println("아이디\t > " + user.getUsername());
			System.out.println("비밀번호 >" + user.getPassword());
			System.out.println("이름\t >" + user.getName());
			System.out.println("이메일\t >" + user.getEmail());
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		UserArrayList2 userService = new UserArrayList2();
		
		while(true) {
			String select = null;
			
			System.out.println("[사용자 관리 프로그램]");
			System.out.println("1. 사용자 등록");
		
			System.out.println("2. 사용자 조회");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.println("메뉴 선택 >>");
			
			select = userService.getScanner().nextLine();
			
			if(select.equals("1")) {
				userService.addUser();
				
			}else if(select.equals("2")) {
				userService.printUserList();
				
			}else if(select.equals("3")) {
				userService.removeUser();
				
			}else if(select.equals("q")){
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
			
			
			
		}
		
	}
	
	
}