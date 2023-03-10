package chapter17.arraylist;

import java.util.ArrayList;

class Shape {
	
	void draw() {
		System.out.println("draw Shape");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("원모양입니다");
	}
		
}

class Rectangle extends Shape {
	
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	
	void rectangle() {
		System.out.println("네모모양입니다");
	}
}

class Triangle extends Shape {
	
	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	
	void triangle() {
		System.out.println("세모모양입니다");
	}
}

public class ShapeTest {
	
	//Shape와 Shape를 상속받은 모든 클래스 타입이 사용하는 ArrayList
	ArrayList<Shape> sList = new ArrayList<Shape>();

	public static void main(String[] args) {
		ShapeTest sTest = new ShapeTest();
		System.out.println("- - 업캐스팅 - -");
		sTest.addShape(); //Shape sc = new Circle
		System.out.println("- - 다운캐스팅 - -");
		sTest.testCasting();
		

	}

	public void addShape() {
		sList.add(new Circle()); //Circle s = new Circle();
		sList.add(new Rectangle());
		sList.add(new Triangle());
		
		for(Shape s:sList) {
			s.draw();
		}
	}
	
	public void testCasting() {
		
		for(int i=0; i<sList.size(); i++) {
			Shape s = sList.get(i); //일단 부모(Shape) 타입으로 가져옴
			
			if(s instanceof Circle) {
				Circle c = (Circle)s; //다운캐스팅
				c.circle();
			} else if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s; //다운캐스팅
				r.rectangle();
			} else if(s instanceof Triangle) {
				Triangle t = (Triangle)s; //다운캐스팅
				t.triangle();
			} else {
				System.out.println("지원되지 않는 타입입니다");
			}
		}
		
	}
}
