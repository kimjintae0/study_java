package lesson07_3;

//import java.util.Date;
//import java.util.Scanner;
import java.util.*; // 안에있는 유틸 전부사용

public class PackageEx {
	public static void main(String[] args) {
		lesson07.TvMain main = new lesson07.TvMain();
		Scanner Scanner = new java.util.Scanner(java.lang.System.in);
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toLocaleString());
		
		// date. 컨트롤 스페이스 > java.util , java.sql
		
	}
}
