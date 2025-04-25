package lesson17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileEx {
	public static void main(String[] args) throws Exception {
		// 1gb
		// 1024 * 1024 * 10024
//		File file = new File("1gb.txt");
//		FileWriter writer = new FileWriter(file);
//		BufferedWriter bw = new BufferedWriter(writer);
//		for (int i = 0; i < 1024 * 1024 * 1024; i++) {
//			bw.write('A');
//		}
//		bw.close();
//		writer.close();
		
		File folder = new File("1000files"); // 싱글 스레드, 멀티 스레드 복사 속도 차이
		folder.mkdir();
		
		for (int i = 0; i < 1024 ; i++) {
			File file = new File("1000files\\"+i+".txt");
			FileWriter writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			for (int j = 0; j < 1024 * 1024; j++) {
				bw.write('B');
			}
			bw.close();
			writer.close();
			System.out.println(file + " 생성됨");
		}
		
	}
}



