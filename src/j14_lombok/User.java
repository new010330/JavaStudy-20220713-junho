package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
	
	private String email;
	private String name;
	@NonNull // 아래 변수에 무조건 값을 넣어야한다. 
	private String username;
	@NonNull
	private String password;
	
	
}
