package j07_반복;

public class ProtocolSubString {

	public static void main(String[] args) {
		String data = "@Message:안녕하세요.@To:김준일@From:김준이@SendDate:2022/07/21";

		int commandIndex = data.indexOf("@") + 1;
		
		while(true) {
			int contentIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1);
			
			String command = data.substring(commandIndex, contentIndex);
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex)
					: data.substring(contentIndex + 1);
			
			System.out.println(command + ": " + content);
			
			if(nextCommandIndex == -1) {
				break;				
			}
			
			data = data.substring(nextCommandIndex);
		}
		

	}

}
