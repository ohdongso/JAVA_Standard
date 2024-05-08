package Chapter07;

public class _02_DrawShape {
	/*
		1, Circle과 Shape는 상속관계, Circle과 Point는 포함관계
		2, Circle클래스는 Shape클래스로부터 모든 멤버를 상속받았으므로, Shape클래스에 정의된 color나 draw()를 사용할 수 있다.
	 */
	
	public static void main(String[] args) {
		// Point 3개의 객체를 배열에 담는다.
		Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };
		
		// p배열에 담긴 Point객체의 (x,y)좌표를 출력한다.
		Triangle t = new Triangle(p);
		
		
		Circle c = new Circle(new Point(150, 150), 50);
		
		t.draw(); // 삼각형을 그린다.
		c.draw(); // 원을 그린다.
	}
}

class Shape {
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
} // Shape 끝.

class Point {
	int x;
	int y;
	
	Point() { // 기본생성자
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(" + x + ", " + y + ")"; // x와 y의 값을 문자열로 반환
	}
} // Point 끝.

class Circle extends Shape {
	Point center; // 원의 원점좌표
	int r; // 반지름
	
	public Circle() {
		this(new Point(0, 0), 100); // Circle(Point centre, int r)를 호출
	}
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() { // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
} // Circle 끝.

class Triangle extends Shape {
	Point[] p = new Point[3]; // 3개의 Point인스턴스를 담을 배열을 생성한다. 
	
	public Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",
			p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
} // Triangle 끝.