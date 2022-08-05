package j09_클래스2.User;

public class User {
	private String userName;
	private String password;
	private String name;
	private String email;
	
	public User() {}
	
	public User(String userName, String password, String name, String email) {
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
	}



	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [사용자= " + userName + ", 암호= " + password + ", 이름= " + name + ", 이메일= " + email + "]";
	}
	
	
}
