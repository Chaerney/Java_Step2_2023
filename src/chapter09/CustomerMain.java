package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		
		//VIP 고객		
		System.out.println("- - - - - VIP 고객 - - - - -");
		int price=10000;
		VIPCustomer vipcs=new VIPCustomer(1004, "홍길동", 900);
		
		int vipprice=vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이 "+vipprice+"원을 지불 완료하였습니다");
		System.out.println(vipcs.showCustomer());
		
		System.out.println("- - - - - 일반 고객 - - - - -");
		price=10000;
		Customer silvercs=new Customer(10012, "김사부");
		int silverprice=silvercs.calcPrice(price);
		System.out.println(silvercs.getCustomerName()+"님이 "+silverprice+"원을 지불 완료하였습니다");
		System.out.println(silvercs.showCustomer());
	}

}
