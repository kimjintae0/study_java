package card;

public class Card {
	Kind kind; // SPADE, DIAMOND, HEART, CLOVER
	int number; // 2, 3, 4, ... 10, J, Q, K, AA
	
	Card(Kind kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String numbers = "23456789XJQKA";
		return "[" + kind.getName() + "," + numbers.charAt(number) + "]";
		
	}
}

		
