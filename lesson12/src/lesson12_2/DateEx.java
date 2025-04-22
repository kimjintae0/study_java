package lesson12_2;

import java.text.SimpleDateFormat;
import java.util.Date;

// 
@Deprecated
public class DateEx {
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now.toLocaleString());
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a"); // E 요일정보 a am, pm
		System.out.println(sf.format(now));
				
	}
}
