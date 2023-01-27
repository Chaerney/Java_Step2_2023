package chapter14.hashcode;

public class Key {
	
	public int number;
	
	public Key(int number) {
		this.number=number;
	}

	//논리적 값(데이터)
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number == compareKey.number) {
				return true; //값 일치
			}
		}			
		return false;
	}

	//물리적 주소
	@Override
	public int hashCode() {		
		//return super.hashCode(); //원래 heap 메모리 16진수 주소
		return number; //
	}
	
	
	

}
