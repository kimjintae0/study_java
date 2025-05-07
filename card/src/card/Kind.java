package card;

public enum Kind { // enum 상수 대체자
	CLOVER(1, "클로버"), HEART(10, "하트"), DIAMOND(100, "다이아몬드"), SPADE(1000, "스페이드"); // 클래스,상수
	
	private int score;
	private String name;
	
	Kind(int score, String name) {
		this.score = score;
		this.name = name;
	}

	public int Score() {
		return score;
	}	
	public String getName() {
		return name;
	}
}



