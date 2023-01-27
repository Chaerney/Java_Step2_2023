package chapter15;

public class PersonMain  {

	public static void main(String[] args) throws ClassNotFoundException {	
		
		//방법1
		Person p=new Person();
		Class pClass1=p.getClass(); //Class : 클래스의 정보
		
		System.out.println(pClass1.getName());
		
		//방법2
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//방법3
		Class pClass3=Class.forName("chapter15.Person");
		
		

	}

}
