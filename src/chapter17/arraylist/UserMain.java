package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		
		outer :	while(true) {
			
			System.out.print("아이디 생성 : ");
			Scanner scan = new Scanner(System.in);
			
			UserInfo ui = new UserInfo();
			ui.setId(scan.next());
			
			//아이디 중복 체크
			for(int i=0; i<arr.size(); i++) {
				if(ui.getId().equals(arr.get(i).getId())) {
					System.out.println("중복된 아이디입니다.");
					continue outer;
				}
			}
			//중복된 아이디가 아니라면 pwd 입력 받기
			System.out.println("패스워드 : ");
			Scanner scanpw = new Scanner(System.in);
			ui.setPwd(scanpw.nextInt());
			arr.add(ui);
			
			for(int i=0; i<arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println("- - - - - - - - - - - - - -");
			}
		}

	}

}
