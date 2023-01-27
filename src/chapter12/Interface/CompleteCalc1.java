package chapter12.Interface;

//상속 받아서 add/substract 구현
public abstract class CompleteCalc1 implements Calc {

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		
		return num1-num2;
	}

	
	
	
	
}
