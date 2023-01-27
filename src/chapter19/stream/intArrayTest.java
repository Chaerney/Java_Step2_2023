package chapter19.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class intArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		//sum()은 Integer로 반환하므로 int로 받음
		//한번 생성된 스트림은 재사용 시 다시 생성해야 함
		int sumVal = Arrays.stream(arr).sum();
		//long type이므로 int로 캐스팅
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);

		//int => IntStream 형변환
		IntStream stream = Arrays.stream(arr);
		int sum = stream.sum();
		System.out.println(sum);
		
		//이미 사용했으므로 소멸된 stream
		//count=stream.count(); //erreur
		
		int count2 = (int)Arrays.stream(arr).count();
		System.out.println(count2);
		
		//reduce(초깃값, 전달되는 요소 -> 각 요소가 수행해야 하는 기능)
		System.out.println(Arrays.stream(arr).reduce(0, (a, b) -> a + b));
		
		
	}

}
