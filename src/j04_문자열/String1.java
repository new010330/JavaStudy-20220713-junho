package j04_문자열;

public class String1 {
	
	public static void main(String[] args) {
		String address = "부산시 동래구 사직동";
		int index = address.indexOf("동");
		int index2 = address.lastIndexOf("동") + 1;
		System.out.println(index);
		String subAddress = address.substring(index, index2);
		System.out.println(subAddress);
		
		String replaceAddress = address.replace(' ', '-');
		System.out.println(replaceAddress);
		replaceAddress = address.replaceAll(" ", "-");
		System.out.println(replaceAddress);
		
		String phoneNumbers = "010/9988/1916, 010/1234/5678";
		String rePhone = phoneNumbers.replaceAll("010", "011");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll("/", "-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ", "/");
		System.out.println(rePhone);
		
		String rePhone2 = rePhone2 = phoneNumbers.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(", ", "/");
		System.out.println(rePhone2);
		
	}
}
