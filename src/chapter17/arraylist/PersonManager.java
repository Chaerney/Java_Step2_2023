package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManager {
	
	public void personMng() {
		int select;
		Person p;
		
		ArrayList<Person> personArr = new ArrayList<Person>();
		
		while(true) {
			
			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보");
			System.out.println("4. 종   료");
			System.out.print("항목 선택 => ");
			
			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			
			//if ou switch
			if(select==1) {
				p=new Person();
				System.out.println("- - 정보추가 - -");
				System.out.print("이름 : ");
				p.setName(scan.next());				
				System.out.print("나이 : ");
				p.setAge(scan.nextInt());
				System.out.print("전화 : ");
				p.setTel(scan.next());
				System.out.println("정보가 저장되었습니다");
				System.out.println("- - - - - - - - - - - - -");
				personArr.add(p);
				
			} else if(select==2) {
				System.out.print("탈퇴시킬 회원을 검색하세요 : ");
				String name = scan.next();
				for(int i=0; i<personArr.size(); i++) {
					if(personArr.get(i).getName().equals(name)) {
						personArr.remove(i);
					}
				}
			} else if(select==3) {
				System.out.println("[회원목록]");
				for(int i=0; i<personArr.size(); i++) {
					System.out.println("이름 : "+personArr.get(i).getName());
					System.out.println("나이 : "+personArr.get(i).getAge());
					System.out.println("번호 : "+personArr.get(i).getTel());
					System.out.println("- - - - - - - - - - - - -");
				}
			} else if(select==4) {
				System.out.println("프로그램 종료");
				break;				
			}			
			
		}//while
	}//personMng
	
	

}//class
