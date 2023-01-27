package chapter17.arraylist;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		//팀원들의 정보
		Member memberLee = new Member(1001, "이채윤");
		Member memberKim = new Member(1002, "김소연");
		Member memberOk = new Member(1003, "옥소연");
		Member memberOh = new Member(1004, "오수진");
		//회원가입
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberOk);
		memberArrayList.addMember(memberOh);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberKim.getMemberId());
		
		memberArrayList.showAllMember();
		
		

	}

}
