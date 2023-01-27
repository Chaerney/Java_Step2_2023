package chapter17.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member;
import chapter17.Member2;

public class MemberHashSet {

	private HashSet<Member2> hashSet;
	
	//생성자를 통한 LinkedList 객체 생성
	public MemberHashSet() {
		hashSet = new HashSet<Member2>();
	}
	
	//addMember
	public void addMember(Member2 member) {
		hashSet.add(member);
	}
	
	//removeMember
	public boolean removeMember(int memberID) {
		Iterator<Member2> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			Member2 member = iterator.next();
			int tempID = member.getMemberId();
			if(tempID == memberID) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println("x");
		return false;
		
		
	}
	
	//showAll 출력
	public void showAll() {
		for(Member2 member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
	
}
