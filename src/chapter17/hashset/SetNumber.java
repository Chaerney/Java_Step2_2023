package chapter17.hashset;

import java.util.HashSet;
import java.util.Random;

public class SetNumber {

	public static void main(String[] args) {
		// 정렬 안 됨, 중복 안 됨
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(true) {
			//난수 발생
			int v = (int)(Math.random()*45+1);
			//int r = new Random().nextInt(45)+1;
			
			hs.add(v);
			
			if(hs.size() >= 6)
				break;
		}
		System.out.println(hs);
		

	}

}
