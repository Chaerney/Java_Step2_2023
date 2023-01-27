package chapter17.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member;

public class MemberLinkedList {

	private LinkedList<Member> linkedList;
	
	//생성자를 통한 LinkedList 객체 생성
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	
	//addMember
	public void addMember(Member member) {
		linkedList.add(member);
	}
	
	//removeMember
	public boolean removeMember(int memberID) {
		Iterator<Member> iterator = linkedList.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempID = member.getMemberId();
			if(tempID == memberID) {
				linkedList.remove(member);
				return true;
			}
		}
		System.out.println("x");
		return false;
		
		
	}
	
	//showAll 출력
	public void showAll() {
		for(Member member : linkedList) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	
}
