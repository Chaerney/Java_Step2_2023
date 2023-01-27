package chapter17.arraylist;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {
	
	public void move() {
		System.out.println("사람은 두 발로 걷습니다");
	}
	public void readBook() {
		System.out.println("사람은 책을 읽습니다");
	}
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("호랑이는 네 발로 걷습니다");
	}
	public void hunt() {
		System.out.println("호랑이는 사냥을 합니다");
	}
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("독수리는 하늘을 납니다");
	}
	public void flying() {
		System.out.println("독수리는 날개를 펴고 날아 다닙니다");
	}
}

public class AnimalTest {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	//addAnimal -> 업캐스팅 메서드
	public void addAnimal() {
		aniList.add(new Human()); //Animal형으로 자동 형변환
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal a:aniList) {
			a.move();
		}			
	}
	
	//testCasting -> 다운캐스팅
	public void testCasting() {
		for(int i=0; i<aniList.size(); i++) {
			Animal a = aniList.get(i);
			
			if(a instanceof Human) {
				Human h = (Human)a;
				h.readBook();
			} else if(a instanceof Tiger) {
				Tiger t = (Tiger)a;
				t.hunt();
			} else if(a instanceof Eagle) {
				Eagle e = (Eagle)a;
				e.flying();
			} else {
				System.out.println("존재하지 않습니다");
			}
		}	
	}
	
	public static void main(String[] args) {
		
		AnimalTest animaltest = new AnimalTest();
		System.out.println("- - 업캐스팅 - -");
		animaltest.addAnimal();
		System.out.println("- - 다운캐스팅 - -");
		animaltest.testCasting();
	}

}
