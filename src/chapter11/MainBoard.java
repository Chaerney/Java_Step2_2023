package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		//기본 게임 1단계
		Player player=new Player();
		player.play(1);
		
		//기본 게임 2단계
		AdvancedLevel aLevel=new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		//기본 게임 2단계
		SuperLevel sLevel=new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

		

	}

}
