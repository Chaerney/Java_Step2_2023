package chapter12.MultiInterface;

public interface Sell {
	
	void sell();
	
	//같은 이름의 default 메서드는 존재할 수 없으므로 오버라이딩 해줘야 함
	//최종 오버라이딩 메서드가 출력됨
	
	/*
	default void order() {
		System.out.println("판매 주문");
	}
	
	*/
	default void sellOrder() {
		System.out.println("판매 주문");
	}

}
