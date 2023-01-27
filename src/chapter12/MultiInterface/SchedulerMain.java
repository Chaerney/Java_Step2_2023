package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("R or r : 한 명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 스킬값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			
			//문자를 아스키코드로 형변환
			//charAt(0) : 문자(char) 또는 문자열(String) => ASCII 즉, int
			//char input1=scan.next().charAt(0);
			//int in=System.in.read();
			String input=scan.next();
			int ch=input.charAt(0);
			
			Scheduler scheduler=null;
			
			//객체생성
			if (ch=='R' || ch=='r') {
				scheduler=new RoundRobin();								
			} else if (ch=='L' || ch=='l') {
				scheduler=new LeastJob();			
			} else if (ch=='P' || ch=='p') {
				scheduler=new PriorityAllocation();
			} else if(ch=='S' || ch=='s') {
				System.out.println("종료");
				break;
			} else {
				System.out.println("지원되지 않는 기능입니다");
				continue;
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			
			
		}//while
		
		
		

	}//main

}//class
