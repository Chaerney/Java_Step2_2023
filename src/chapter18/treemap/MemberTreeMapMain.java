package chapter18.treemap;

import chapter17.Member2;
import chapter17.treeset.Member3;

public class MemberTreeMapMain {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		//가방에 넣을 member 데이터
		Member3 memberLee=new Member3(1003, "이지원");
		Member3 memberSon=new Member3(1005, "손민국");
		Member3 memberPark=new Member3(1004, "박서연");
		Member3 memberHong=new Member3(1002, "홍길동");
		
		//가방에 넣기
		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberHong);
		
		memberTreeMap.showAll();
		
		memberTreeMap.removeMember(1003);
		memberTreeMap.showAll();
		//맵 형식 정렬 트리 중복은 해시
	}

}
