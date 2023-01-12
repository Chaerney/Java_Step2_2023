package chapter08;

public class StaticFunction {
	
	String str1="일반 회원변수";
	static String str2="static 회원변수";
	
	public static String getStatic() { 
		
		//static메서드에서는 static 변수만 사용가능
		//str1="VIP";
		
		return str2;
	}
	
}
