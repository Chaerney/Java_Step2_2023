package chapter17.linkedlist;

import chapter17.Member;

public class LinkedListMemberMain {

	public static void main(String[] args) {
		//순서 O, 중복 O
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		
		//팀원들의 정보
		Member memberLee = new Member(1001, "이채윤");
		Member memberKim = new Member(1002, "김소연");
		Member memberOk = new Member(1003, "옥소연");
		Member memberOh = new Member(1004, "오수진");
		//회원가입
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberKim);
		memberLinkedList.addMember(memberOk);
		memberLinkedList.addMember(memberOh);
		
		memberLinkedList.showAll();
		
		Member memberLim = new Member(1003, "임진리");
		memberLinkedList.addMember(memberLim);
		memberLinkedList.showAll();
		
		

	}

}
