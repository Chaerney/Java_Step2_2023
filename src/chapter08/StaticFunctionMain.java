package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		//static메서드는 오히려 객체를 따로 만드는 걸 비추천 
		StaticFunction obj=new StaticFunction();
		System.out.println(obj.str2);
		String s=obj.getStatic();
		System.out.println(s);
		
		
		//static메서드는 클래스명으로 접근이 가능
		String st;
		st=StaticFunction.getStatic();
		System.out.println(st);

	}

}
