package chapter22;

import java.util.Scanner;

public class Account_Main {

	public static void main(String[] args) {
		
		Account acc = new Account();
		Runnable r = new AccontThread(acc);
		
		Thread t1 = new Thread(r);
		t1.start();
		
		//스레드와는 별개로 값을 받아 입금 시키는 코드
		while(true) {
			System.out.print("입금할 금액을 입력하세요 --> ");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			acc.deposit(n);
			
			if(acc.balance==0) {
				break;
			}
		}
		

	}

}
