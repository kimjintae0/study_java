package lesson09;

public class Complexer implements Printer, Scanner, Fax{

	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER + "에서 "+tel+"로 FAX 전송");
	}
	public void receive(String tel) {
		System.out.println(tel + "에서 "+FAX_NUMBER+"로 FAX 전송");
	}
	public void scan() {
		System.out.println("스캔 실행");
	}
	public void print() {
		System.out.println("출력 실행");
	}

	
	
}
