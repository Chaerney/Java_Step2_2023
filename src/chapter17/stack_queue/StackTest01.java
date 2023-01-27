package chapter17.stack_queue;

import java.util.Stack;

public class StackTest01 {

	public static void main(String[] args) {
		
		Object obj;
		//empty 스택 생성
		Stack<Object> st = new Stack<Object>();
		//입력
		if(st.empty()) { //스택이 비어있으면
			for(int i=1; i<=5; i++) {
				st.push(new String("Hiii"+i));
				System.out.println(" 입력"+i+"번째 : "+st.peek());
			}
		}//if
		//출력
		st.pop(); //output 5
		System.out.println("현재 Top의 위치(peek) : "+st.peek());//현재 위치 4
		st.pop(); //output 4
		System.out.println("현재 Top의 위치(peek) : "+st.peek());//현재 위치 3
		st.push(new String("Happyyyy"));
		System.out.println(st.peek());
		st.push(new String("Gooooooood"));
		System.out.println(st.peek());

	}

}
