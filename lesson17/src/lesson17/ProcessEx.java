package lesson17;

public class ProcessEx {
	public static void main(String[] args) throws Exception{
		Process p1 = Runtime.getRuntime().exec("notepad.exe");
		Process p2 = Runtime.getRuntime().exec("mspaint.exe");
		p1.waitFor(); // p1 프로세스가 종료될때까지 대기
		p2.destroy(); // p1 프로세스가 종료되면 실행
	}
}
