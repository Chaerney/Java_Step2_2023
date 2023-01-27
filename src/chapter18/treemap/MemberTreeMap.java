package chapter18.treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import chapter17.Member;
import chapter17.Member2;
import chapter17.treeset.Member3;

public class MemberTreeMap {
	
	private TreeMap<Integer, String> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, String>();
	}
	
	public void addMember(Member3 member) {
		
		treeMap.put(member.getMemberId(), member.getMemberName());
		
	}
	
	//removeMember
		public boolean removeMember(int memberID) {
			
			while(treeMap.containsKey(memberID)) {
				treeMap.remove(memberID);
				return true;
				
				}
			System.out.println("x");
			return false;
			}
			
			
			
		
		
		//showAll 출력
		public void showAll() {
			Iterator<Integer> ir=treeMap.keySet().iterator();
			while(ir.hasNext()) {
				int key=ir.next();
				String member=treeMap.get(key);
				System.out.println(member);
			}
			System.out.println();
			
		}

}
