package lesson12;

import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=rgyf5tpk";
		// 프로토콜://도메인/파일명?쿼리스트링
		// 1. 위 항목에 맞춰 문자열 자르기
//		String protocol = url.substring(0, url.indexOf("://"));
//		System.out.println(protocol);
//		url = url.substring(url.indexOf("://")+"://".length());
//		
//		String domain = url.substring(0, url.indexOf("/"));
//		System.out.println(domain);
//		url = url.substring(url.indexOf("/")+"/".length());
//	
//		
//		String fileName = url.substring(0, url.indexOf("?"));
//		System.out.println(fileName);
//		url = url.substring(url.indexOf("?")+"?".length());
//		
//		String queryString = url;
//		System.out.println(queryString);
		MyUrl myurl = new MyUrl(url);
		System.out.println(myurl);
		
		
	}
}		

class MyUrl {
	String protocol;
	String domain;
	String fileName;
	String queryString;
	Param[] Params;
	
//	key, value 
	
	public MyUrl(String url) {
		protocol = url.substring(0, url.indexOf("://"));
		url = url.substring(url.indexOf("://")+"://".length());
		
		domain = url.substring(0, url.indexOf("/"));
		url = url.substring(url.indexOf("/")+"/".length());
		
		fileName = url.substring(0, url.indexOf("?"));
		url = url.substring(url.indexOf("?")+"?".length());
		
		queryString = url;
		String[] tmps = queryString.split("&");
		Params = new Param[tmps.length];
		for (int i = 0; i < tmps.length; i++) {
//			 System.out.println(tmps[i]);
			 String [] t = tmps[i].split("=");
			 Params[i] = new Param(t[0], t[1]);
			
		}	
		
	}

	@Override
	public String toString() {
		return String.format("MyUrl [protocol=%s, domain=%s, fileName=%s, queryString=%s, Params=%s]", protocol, domain,
				fileName, queryString, Arrays.toString(Params));
		}
	}
	// code 자주사용되는 기능 > source  > Generate tostring()


	

	
	class Param {
		String key;
		String value;
		public Param(String key, String value) {
			super();
			this.key = key;
			this.value = value;
			
		}
		
	}

		
		
		
		
		


		
//		String[] fileNames = {"where=nexearch", "sm=top_hty", "fbm=0", "ie=utf8", "query=%EA%B3%A0%EC%96%91%EC%9D%B4", "ackey=rgyf5tpk"};
//		for (int i = 0; i < fileNames.length; i++) {
//			if(fileNames[i].endsWith("")) {
//			//	System.out.println(url.substring(url.indexOf(""), url.lastIndexOf("")));
//				System.out.println(fileNames[i]);
//			//	System.out.println(fileNames.substring(fileNames.length, fileNames.length));
//			}
//		}

		
		//where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=rgyf5tpk";
		// 쿼리스트링은 키1=값1&키2=값2 >> where=nexearch, sm=top_hty, fbm=0, ie=utf8, query=%EA%B3%A0%EC%96%91%EC%9D%B4, ackey=rgyf5tpk"
		// 즉 값의 쌍은 &로 구분, 키와 값은 =로 구분
		
//	}
//}
