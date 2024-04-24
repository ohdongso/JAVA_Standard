package Chapter06;

public class _05_CardTest {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Space";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number
						+ "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		
		System.out.println("c2은 " + c2.kind + ", " + c2.number
						+ "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c2.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number
				+ "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );

		System.out.println("c2은 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
	}
}

class Card {
	String kind;
	int number;
	
	// 클래스 변수선언
	// Card클래스로 객체를 생성하면 해당 변수를 모든 객체가 공유한다.
	static int width = 100;
	static int height = 250;
}