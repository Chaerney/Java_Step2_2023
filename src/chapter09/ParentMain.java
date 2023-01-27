package chapter09;

public class ParentMain {

	public static void main(String[] args) {
		
		ChildExample c1=new ChildExample();
		
		System.out.println(c1.getCar());
		System.out.println(c1.getMoney()); //상속분
		System.out.println("=============================");
		//=============================================
		if(c1 instanceof ParentExample) {
			System.out.println("c1은 ParentExample의 자식 클래스입니다");
			System.out.println(c1.getMoney());
		}
		//=============================================
		//형변환
		ChildExample ch=new ChildExample();
		ParentExample p1=new ParentExample();
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		//부모=자식
		p1=ch; //자동형변환
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		ch=(ChildExample)p1; //명시적인 형변환
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
		

	}

}
