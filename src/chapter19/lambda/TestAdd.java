package chapter19.lambda;

public class TestAdd {

	public static void main(String[] args) {
		//Lambda : 메서드 이름이 없음. 구현부만 존재
		Add addF = (x, y) -> x + y;
		
		System.out.println(addF.add(3, 5));
		
	}

}
