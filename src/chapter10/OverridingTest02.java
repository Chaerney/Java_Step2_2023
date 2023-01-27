package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest02 {

	public static void main(String[] args) {
		//부모=자식 (자동형변환)
		Customer vc=new VIPCustomer(1414, "용용", 22);
		
		System.out.println(vc.showCustomer());
		

	}

}
