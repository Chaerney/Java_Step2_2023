package chapter12.Interface;

public interface Calc {
	
	double PI=3.14;
	int ERROR=-999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
		myMethod(); //private method 호출
	}
	
	static int total(int[] arr) {
		int total=0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod(); //private method 호출 테스트
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드입니다");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다");
	}
	
	//인터페이스 요소
	/*
	#추상메서드 : Body가 없는 메서드로 사용할면 무조건 재정의가 필요
	- - Java8부터 제공 - - 
	#디폴트메서드 : 기본 수행문을 가질 수 있는 메서드이며 재정의를 할 수 있
	#정적(static)메서드 : 객체 생성과 관계없이 인터타입(클래스명)으로 사용할 수 있다
	#private메서드 : 인터페이스를 구현한 클래스에서는 사용 가능하나 재정의 할 수 없음
					인터페이스(현재의 클래스)에서만 사용하기 위함.
	 
	 */
	 
	
	
	
}
