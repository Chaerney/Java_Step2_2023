package chapter09;

public class Strawberry extends Berry {

	private String color;
	private int price;
	
	//setter
	public void Set3(String a, int b) {
		color=a;
		price=b;
	}
	
	//getter
	public void Disp3() {
		System.out.println("색상 : "+color);
		System.out.println("가격 : "+price);
	}
}
