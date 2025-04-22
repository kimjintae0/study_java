package lesson12_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		String regex = "\\d"; // 숫자
		regex = "[0-9]"; // 숫자
		regex = "\\D;"; // 숫자아님
		regex = "[^0-9]"; // 숫자아님		
		// 소문자 b로 시작하는 알파벳 소문자 0개 이상 규칙
		Pattern p = Pattern.compile("b[^A-Za-z]");
		Matcher m;
		String[] strs = {"bat", "cat", "bed", "bAt", "Bat", "b","b0"};
		
		// 이메일주소패턴
		// 휴대전화번호 패턴
		
		for(String s: strs) {
			m = p.matcher(s);
			System.out.println(s + " = " + m.matches());
			
		}
		String tel = "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		String p1 = "010-1010-1111";
		System.out.println(p1.matches(tel));
		
		System.out.println("abcd1234abcd".replace("a", "e"));
		System.out.println("abcd1234abcd".replaceAll("a", "e"));
	}
}
		
//		// 문자열 bat 확인
//		m = p.matcher("bat");
//		System.out.println("bat = " + m.matches());
//
//		// 문자열 cat 확인
//		m = p.matcher("cat");
//		System.out.println("cat = " + m.matches());
//		
//		// 문자열 bed 확인
//		m = p.matcher("bed");
//		System.out.println("bed = " + m.matches());
//	}
//}

		
		
		