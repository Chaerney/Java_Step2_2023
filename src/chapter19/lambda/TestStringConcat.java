package chapter19.lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		//인스턴스 방식
		System.out.println("- - 인스턴스 방식 - -");
		StringConcatImple cc1 = new StringConcatImple();
		cc1.makeString(s1, s2);
		
		//람다식 방식
		System.out.println("- - 람다식 방식 - -");
		StringConcat cc2 = (s, v) -> System.out.println(s+", "+v);
		cc2.makeString("Hello", "World");
		
		//익명의 내부 클래스 방식
		System.out.println("- - 익명의 내부 클래스 방식 - -");
		StringConcat cc3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
				
			}
		};
		cc3.makeString(s1, s2); //호출
		
	}

}
