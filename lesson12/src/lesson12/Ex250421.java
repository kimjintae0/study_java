package lesson12;

public class Ex250421 {
	public static void main(String[] args) {
//		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=rgyf5tpk";
		// 프로토콜://도메인/파일명?쿼리스트링
		// 1. 위 항목에 맞춰 문자열 자르기
		String url = new String("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=rgyf5tpk"); 
		
		
//		  url으로 시작하지 않는 이름만 출력
//		for (int i = 0; i < args.length; i++) {
//			if() { 
//				System.out.println(i);
//			}
//		}
		
		String[] fileNames = {"where=nexearch", "sm=top_hty", "fbm=0", "ie=utf8", "query=%EA%B3%A0%EC%96%91%EC%9D%B4", "ackey=rgyf5tpk"};
		for (int i = 0; i < fileNames.length; i++) {
			if(fileNames[i].endsWith("")) {
			//	System.out.println(url.substring(url.indexOf(""), url.lastIndexOf("")));
				System.out.println(fileNames[i]);
			//	System.out.println(fileNames.substring(fileNames.length, fileNames.length));
			}
		}
	}
}
		
		//where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=rgyf5tpk";
		// 쿼리스트링은 키1=값1&키2=값2 >> where=nexearch, sm=top_hty, fbm=0, ie=utf8, query=%EA%B3%A0%EC%96%91%EC%9D%B4, ackey=rgyf5tpk"
		// 즉 값의 쌍은 &로 구분, 키와 값은 =로 구분
		
//	}
//}
