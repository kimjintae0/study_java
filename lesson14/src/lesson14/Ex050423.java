package lesson14;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Ex050423 {
	public static void main(String[] args) {
		// Map을 사용한 문자의 빈도 계산
		String str = "aaaaabbbbcccddddd";
		Map<String, Integer> map = new HashMap<>();
		// {a:5, b:4, c:3 d:5} > 이런 형태가 나올수 있도록 처리 해보기 
		// 문자열, 문자배열, 문자열배열
		String[] strs = str.split("");
		
		Stream.of(strs).forEach(s->{
			Integer i = map.get(s);
			map.put(s, i == null ? 1 :i + 1);
			System.out.println(map);
		});
		for(String s : strs) {
			Integer i = map.get(s);
//			if(i == null) {
//				map.put(s, 1);
//			}
//			else{
//				map.put(s, i+1);
//			}
			map.put(s, i == null ? 1 : i +1);
		}
		System.out.println(map);
	}
}









