package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		
		//x,y,myinterface클래스 타입의 인스턴스 변수를 선언하여 출력
		MyClass mc=new MyClass();
		X xclass=mc; //x클래스 타입의 인스턴스 변수
		xclass.X();
		
		Y yc=mc;
		yc.Y();
		
		MyInterface ic=mc;
		ic.myMethod();
		ic.X();
		ic.Y();
		

	}

}
