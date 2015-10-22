package encapsule;
/**
 * @file_name  : CardMain.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 23.
 * @story      : 트럼프 게임
 */

import org.omg.Messaging.SyncScopeHelper;

public class Card {
	//멤버 필드
	private String kind; // 카드의 무늬(스페이드, 다이아, 하트, 클럽)
	private int number; // 카드의 넘버 (1 ~ 13)
	private int number2;
	static int WIDTH = 100; // 카드의 너비
	static int HEIGHT = 180; // 카드의 높이
	private int random1;
	private int random2;
	//get 읽다
	//set 쓰다

	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = "하트";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = random1;
	}
	
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = random2;
	}
	public int getRandom1() {
		return random1;
	}

	public void setRandom1(int random1) {
		this.random1 = (int) (Math.random()*13) + 1;
	}

	public int getRandom2() {
		return random2;
	}

	public void setRandom2(int random2) {
		this.random2 = (int) (Math.random() * 13) + 1;
	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return 
//	}
	// number1 = random1, number2 = number2

}