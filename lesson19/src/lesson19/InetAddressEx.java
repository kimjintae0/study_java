package lesson19;

import java.net.InetAddress;

public class InetAddressEx {
	public static void main(String[] args) {
		
		try {
			InetAddress ip = InetAddress.getByName("www.naver.com");
			System.out.println("hostname:" + ip.getHostName());
			System.out.println("ip : " + ip.getHostAddress()); // > HostAddress 도메인
			
			
			InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
			for(InetAddress i : ips) {
				System.out.println("ip 주소 :" + i);
			}
			
			byte[] ipAddr = ip.getAddress();	// > 바이트 계열로 나옴
			
			for(byte b : ipAddr) {
				System.out.print((( b < 0) ? b + 256 : b) + ".");	// 4바이트 배열 256 더하면 아이피랑 동일
			}
			System.out.println();
			
			
			InetAddress local = InetAddress.getLocalHost();	// 
			System.out.println("내컴퓨터 IP" + local);
			
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostAddress() + " 주소 :" +ip2);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}	
}



