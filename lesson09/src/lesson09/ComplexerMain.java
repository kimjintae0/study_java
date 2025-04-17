package lesson09;

import java.util.Comparator;
import java.util.Iterator;

public class ComplexerMain {
	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
		Comparable<?> c; // 비교 
		Comparator<?> c2; // 비교자 / 객체로 만드려고 사용 > 비교해서 정렬만드려고 사용
		
		Iterable<?> i; // 순환 반복
		Iterator<?> i2; // 반복자  
			                       
	
	}
}



