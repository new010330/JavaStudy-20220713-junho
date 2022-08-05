package j12_다형성.인터페이스;

public class Computer {
	
	private ConnectionTerminal connectionTerminal;
	
	public Computer(ConnectionTerminal connectionTerminal) {
		this.connectionTerminal = connectionTerminal;
	}

	public void powerOn() {
		System.out.println("컴퓨터의 전원를 켭니다.");
		connectedDisplay();
		// 아래 정의된 conectedDisplay에 접근하여 터미널.커넥트에 접근
		// -> 모니터에 Override된 커넥트를 HDMI를 통해 가져온다..
		showConnectionTerminalVersion();
		soundOn();
	}
	
	public void powerOff() {
		disConnectedDisplay();
		System.out.println("컴퓨터의 전원을 끕니다.");
		
	}
	
	private void connectedDisplay() {
		System.out.println("출력 장치를 연결합니다.");
		connectionTerminal.connect();
	}
	
	private void disConnectedDisplay() {
		System.out.println("출력 장치 연결을 해제합니다.");
		connectionTerminal.disConnect();
	}
	
	private void soundOn() {
		if(connectionTerminal instanceof HDMI) { // HDMI의 객체가 터미널이라면
			((HDMI) connectionTerminal).soundOutput(); // HDMI 형 터미널에 접근하여 사운드아웃풋을 실행하라
			System.out.println("소리를 출력합니다.");
			
		}else {
			System.out.println("연결된 스피커가 없습니다.");
			
		}
	}
	
	private void showConnectionTerminalVersion() {
		if(connectionTerminal instanceof HDMI) { // HDMI의 객체가 터미널이라면
			System.out.println("HDMI Version: " + HDMI.VERSION);
			// HDMI의 VERSION을 출력하라
		}else if(connectionTerminal instanceof VGA) {
			System.out.println("VGA Version: " + VGA.VERSION);
			
		}else {
			System.out.println("Version Information is missing");
		}
	}
}