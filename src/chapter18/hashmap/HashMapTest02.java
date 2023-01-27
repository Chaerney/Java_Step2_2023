package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest02 {

	public static void main(String[] args) {
		// Map<String, Integer> 생성 map
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//팀원 데이터(이름, 학번)저장
		map.put("김병효", 1111);
		map.put("이채윤", 2222);
		map.put("김형우", 3333);
		map.put("김주은", 4444);
		map.put("김지성", 5555);
		map.put("윤민주", 6666);
		//팀원 인원
		System.out.println("IT프렌즈 총 인원 : "+map.size()+"명");
		
		//팀장의 학번을 알아내자
		System.out.println("팀장의 학번 : "+map.get("김병효"));
		
		//팀원 모두의 학번 출력
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); //키
			Integer value = map.get(key); //키를 이용하여 값 불러오기
			System.out.println(key+" : "+value);
		}
		System.out.println();
	}

}
