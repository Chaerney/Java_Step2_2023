package chapter19.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		//가방
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
				
		//객체 생성
		TravelCustomer tc1 = new TravelCustomer("일일일", 11, 1000);
		TravelCustomer tc2 = new TravelCustomer("이이이", 22, 2000);
		TravelCustomer tc3 = new TravelCustomer("삼삼삼", 33, 3000);
		
		customerList.add(tc1);
		customerList.add(tc2);
		customerList.add(tc3);
		
		System.out.println("- - 고객 명단 추가된 순서대로 출력 - -");
		//map : data를 특정 조건에 해당하는 값으로 변환해 줌
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		//mapToInt : int 형 자료로 변환
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 금액 : "+total);
		//filter : 특정 조건에 맞는 데이터만 걸러냄
		System.out.println("- - 20세 이상의 고객의 이름을 정렬 후 출력 - -");
		customerList.stream().filter(c -> c.getAge() >= 20).
		map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
		

	}

}
