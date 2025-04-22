package lesson12_2;

import java.util.Random;

public class RandemEx {
	public static void main(String[] args) {
		Random random = new Random(0);
		random.nextDouble(); // Math.random();
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println(random.nextInt(6) + 1);
			
		} 
	}
}
