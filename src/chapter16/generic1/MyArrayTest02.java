package chapter16.generic1;

class MyArrayG<E> {
	
	private Object[] array = new Object[10];
	int i;
	
	public void add(Object obj) {
		
		array[i++]=obj;
		
	}
	
	public E get(int index) {
		
		return (E)array[index];
		
	}
	
}


public class MyArrayTest02 {

	public static void main(String[] args) {
		
		MyArrayG<String> myarray1 = new MyArrayG<>();
		myarray1.add(new String("test"));
		String str=myarray1.get(0);
		System.out.println(str);
		
		MyArrayG<Integer> myarray2 = new MyArrayG<>();
		myarray2.add(new Integer(100));
		Integer num=myarray2.get(0);
		System.out.println(num);
		//구체적인 타입 적지 않고 변수형태로 적어놓고 객체를 생성할 때 지정
	}

}
