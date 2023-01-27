package chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.StringTokenizer;




public class NewPersonMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person p1 = new Person();
		System.out.println(p1);
		
		Class pClass=Class.forName("chapter15.Person");
		System.out.println(pClass);
		Person p2 = (Person)pClass.newInstance();
		System.out.println(p2);
		
		//===========================================
		//String 클래스의 정보 가져오기
		Class strClass=Class.forName("java.lang.String");
		System.out.println(strClass);
		//String 클래스의 생성자들 정보
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println("= = = = = = = = = = = = = = = = =");
		
//		Field[] field = strClass.getFields();
//		for(Field f :field) {
//			System.out.println(f);
//		}
		
		Method[] method=strClass.getMethods();
		for(Method m:method) {
			System.out.println(m);
		}
		
		//========================================================
		String str="Have,a,nice,day";
		
		//Tokenizer
		//StringTokenizer(1,2,3)
		//1 : 사용할 String 문자열
		//2 : 분리하는 기준
		//3 : 자르는 기준을 표시할건지 여부
		StringTokenizer obj=new StringTokenizer(str,",", false);
		
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}

	}

}
