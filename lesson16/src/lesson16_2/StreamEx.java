package lesson16_2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		// 1. 스트림 생성 방법
		// of(), builder(), generate(), 배열로부터, 컬렉션으로 부터
		
		// 2. 스트림의 종류
		// Stream<T>, InStream, DoubleStream, LongStream
		
		// 3. 스트림의 연산
		// 최종연산
		// forEach()
		// 중간연산
		// filter(), distinct(), map(), flatMap(), boxed(), sorted(), peek()
		
//		IntStream.range(1, 10).forEach(System.out::println); // > IntStream 상태
		List<Integer> list = IntStream.range(1, 10).boxed().sorted((o1, o2)->o2-o1).collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> list2 = new Random().ints(10, 0, 10).boxed().peek(System.out::println).collect(Collectors.toList());
		System.out.println(list2);
		
		boolean result = Stream.of(1, 3, 5, 8).allMatch(i->i%2==1);
		System.out.println(result);
		
		result = Stream.of(1, 3, 5, 8).anyMatch(i->i%2==1);
		System.out.println(result);
		
		
	}
}











