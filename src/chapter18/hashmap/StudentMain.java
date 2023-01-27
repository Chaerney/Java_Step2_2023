package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		//학생 정보, 점수
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		//중복 안 됨.
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "홍길은"), 95);
		map.put(new Student(3, "홍길금"), 85);
		map.put(new Student(4, "홍홍홍"), 90);
		map.put(new Student(5, "길길길"), 98);
		
		//저장된 총 엔트리 수 출력
		System.out.println("총 Entry 수 : "+map.size());
		
		//하나씩 처리하는 방법
		Set<Student> keySet=map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			Student key = keyIterator.next();
			Integer value=map.get(key);
			System.out.println(key+" : "+value);
		}
		
		Scanner scan = new Scanner(System.in);
		Student std; //선언
		int input;
		String name;
		
		while(true) {			
			System.out.print("학생 번호를 입력하세요 : ");
			input=scan.nextInt();
			System.out.print("학생 이름을 입력하세요 : ");
			name=scan.next();
			std=new Student(input, name); //heap
			
			if(map.containsKey(std)) {
				System.out.println(name+" 학생의 점수는 : "+map.get(std));
				break;
			} else {
				System.out.println("해당 학생은 존재하지 않습니다");
			}
			
		}
		
	}

}
