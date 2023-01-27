package chapter17.treeset;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member3 memberPark = new Member3(1003, "박현정");
		Member3 memberLee = new Member3(1001, "이은정");
		Member3 memberSon = new Member3(1002, "손민주");
		
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberPark);
		
		memberTreeSet.showAllMember();

	}

}
