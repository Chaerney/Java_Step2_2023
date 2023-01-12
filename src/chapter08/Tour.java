package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		//관광객 등록
		Scanner s=new Scanner(System.in);
		System.out.print("관광객 수 : ");
		int people=s.nextInt();
		
		//초기화를 통하여 메모리 확보 및 고객 생성(Guide의 객체)
		Guide guide=new Guide(people);
		
		System.out.println("관광객 등록");
		for(int i=0; i<people; i++) {
			System.out.print((i+1)+". 이름 : ");
			guide.guest[i].setName(s.next());
			System.out.print((i+1)+". 성별 : ");
			guide.guest[i].setGender(s.next());
			System.out.println("- - - - - - - - - - - - -");
		}
		
		
		while(true) {
			
			System.out.println("[1] 관광객 정보 \n[2] 목적지 변경 \n[3] 종료");
			System.out.print("선택 ==> ");
			int selecNum=s.nextInt();
			
			switch (selecNum) {
			case 1: {
				for(int i=0; i<people; i++) {
					System.out.println((i+1)+". 이름 : "+guide.guest[i].getName());
					System.out.println((i+1)+". 성별 : "+guide.guest[i].getGender());
					System.out.println((i+1)+". 목적지 : "+Guide.point);
					System.out.println("- - - - - - - - - - - - -");
				}
				
				break;
			}
			case 2: {
				System.out.print("어디로 변경하시겠습니까? ==> ");
				Guide.point=s.next();
				System.out.println(Guide.point+"(으)로 목적지 변경");
				System.out.println("== == == == == == == == == == ==");
				break;
			}
			case 3: {
				System.out.println("종료");				
				break;
			}
			default:
				System.out.println("번호를 잘못 입력하셨습니다");
			}//switch
			
			if(selecNum==3)
				break;
		}//while
		
		

	}//main

}//class
