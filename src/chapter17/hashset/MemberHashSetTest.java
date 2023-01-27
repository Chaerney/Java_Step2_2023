package chapter17.hashset;

import chapter17.Member;
import chapter17.Member2;
import chapter17.linkedlist.MemberLinkedList;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		//순서 O, 중복 O
		MemberHashSet memberHashSet = new MemberHashSet();
		
		//팀원들의 정보
		Member2 memberLee = new Member2(1001, "이채윤");
		Member2 memberKim = new Member2(1002, "김소연");
		Member2 memberOk = new Member2(1003, "옥소연");
		Member2 memberOh = new Member2(1004, "오수진");
		//회원가입
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberOk);
		memberHashSet.addMember(memberOh);
		
		memberHashSet.showAll();
		//방법1
		//Member2 memberLim = new Member2(1003, "옥소연");
		//방법2
		Member2 memberLim = new Member2(1003, "임진리");
		memberHashSet.addMember(memberLim);
		
		memberHashSet.showAll();

	}

}
