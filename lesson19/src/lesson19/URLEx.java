package lesson19;

import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws Exception {
		String addr = "https://search.pstatic.net:443/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAzMjRfMjQx%2FMDAxNzQyODE3Mzc0NjU3.ne01b90wPIeEWeUWVb8qn1vWaPnvO2gfjFQt1UaZJYwg.LUcqpJhizLR3oRIoQNebQkGWlmNZcRFUHpYlevyFIr0g.PNG%2F10.PNG&type=a340#abc";
		URL url = new URL(addr);
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getPath());
		System.out.println(url.getFile());
		System.out.println(url.getQuery());
		System.out.println(url.getRef());
	} 
}
