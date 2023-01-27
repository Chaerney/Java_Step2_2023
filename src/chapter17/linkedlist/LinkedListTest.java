package chapter17.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		// 특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞뒤 링크로 연결
		// 빈번한 객체 삭제 삽입이 일어나는 곳에서는 ArrayList보다 성능이 좋다
		
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		myList.add(1, "D");
		System.out.println(myList);
		
		myList.addFirst("O");
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		System.out.println(myList);
		
		myList.addLast("G");
		System.out.println(myList);

	}

}
