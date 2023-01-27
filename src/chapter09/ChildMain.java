package chapter09;

public class ChildMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method1();//parent
		child.method2();//child
		child.method3();//child

		System.out.println();
		
		Parent parent2=child; //넘어갈 때 오버라이딩 된 걸로
		parent2.method1();//parent
		parent2.method2();//child
		
		System.out.println();
		//완전히 부모 거를 쓰고 싶으면 독립적으로 faire
		Parent parent1 = new Parent();
		parent1.method1();//parent
		parent1.method2();//parent 
		
	
		
		
		
		
	}

}
