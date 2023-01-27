package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import chapter17.Member;
import chapter17.Member2;

public class MemberHashMap {
	
	private HashMap<Integer, String> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, String>();
	}
	
	public void addMember(Member2 member) {
		
		hashMap.put(member.getMemberId(), member.getMemberName());
		
	}
	
	//removeMember
		public boolean removeMember(int memberID) {
			
			while(hashMap.containsKey(memberID)) {
				hashMap.remove(memberID);
				return true;
				
				}
			System.out.println("x");
			return false;
			}
			
			
			
		
		
		//showAll 출력
		public void showAll() {
			Iterator<Integer> ir=hashMap.keySet().iterator();
			while(ir.hasNext()) {
				int key=ir.next();
				String member=hashMap.get(key);
				System.out.println(member);
			}
			System.out.println();
			
		}

}
