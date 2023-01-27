package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonManagerMOI {
	
	public void personManMoi() {
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
			
			switch (select) {
			case 1:
				p = new Person();
				System.out.print("이름 : ");
				p.setName(scan.next());
				System.out.print("나이 : ");
				p.setAge(scan.nextInt());
				System.out.print("번호 : ");
				p.setTel(scan.next());
				
				personArr.add(p);
				System.out.println(p.getName()+" 님이 등록되었습니다");
				System.out.println("- - - - - - - - - - - - - - -");			
				break;
			case 2:
				System.out.print("삭제할 회원의 이름을 입력하세요 -->  ");
				String removeMember = scan.next();
				for(int i=0; i<personArr.size(); i++) {
					if(personArr.get(i).getName().equals(removeMember)) {
						personArr.remove(i);
						System.out.println(removeMember+" 삭제 완료");
					}
				}
				break;
			case 3:
				System.out.println("[회원정보]");
				System.out.println("회원은 총 "+personArr.size()+"명이 있습니다");
				for(int i=0; i<personArr.size(); i++) {
					System.out.println("이름 : "+personArr.get(i).getName());
					System.out.println("나이 : "+personArr.get(i).getAge());
					System.out.println("번호 : "+personArr.get(i).getTel());
					System.out.println("- - - - - - - - - - - - - - -");
				}
				break;
			default:
				System.out.println("프로그램 종료");
				return;
			}
			
			
			
			
		}
		
		
		
		
	}//personMng

}//class
