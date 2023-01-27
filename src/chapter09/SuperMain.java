package chapter09;

public class SuperMain {

	public static void main(String[] args) {
		
		Paprika obj=new Paprika();
		obj.Set1("피망류", "여름", "옐빠쁘"); //부모 클래스의 생성자
		obj.Set2("빨강", 7000, "빨빠쁘"); //자식 클래스의 생성자
		
		obj.Disp1();
		obj.Disp2();
		

	}

}
