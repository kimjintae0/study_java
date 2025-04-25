package lesson16_2;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {
		Optional<Integer> optional = Optional.ofNullable(null); // optional > null처리 추가 연산
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		else {
			System.out.println(50);
		}
		
		System.out.println(optional.orElse(20));
		System.out.println(optional.orElseGet(()->30)); 
		
		System.out.println(optional.isPresent());
		System.out.println(optional.isEmpty());
		
		optional.ifPresent(System.out::println); // ifPresent 존재한다면 나오고 null값 가지면 안나옴
		
		optional.orElseThrow(()->new RuntimeException("값이 없음"));
		
	}
}
