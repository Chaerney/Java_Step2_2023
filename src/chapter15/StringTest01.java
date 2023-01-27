package chapter15;

public class StringTest01 {

	public static void main(String[] args) {
		
		String javaStr=new String("java "); //heap
		String androidStr=new String(" android"); //heap
		System.out.println(javaStr); //toString
		System.out.println(javaStr.hashCode()); //10진수
		System.out.println(System.identityHashCode(javaStr)); //16진수
		
		javaStr=javaStr.concat(androidStr);
		System.out.println();
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr)); //덮어쓰기
		

	}

}
