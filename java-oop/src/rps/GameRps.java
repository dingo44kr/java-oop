package rps;

public class GameRps {
	int rock; // 바위
	int paper; // 보자기
	int scissors; // 가위
	int comVal; // 컴퓨터가 생성하는 랜덤 가위,바위,보 값
	String rpsVal; // 숫자와 대응되는 값
	
	public int getRock() {
		return rock;
	}
	public int getPaper() {
		return paper;
	}
	public int getScissors() {
		return scissors;
	}
	public String getRpsVal() {
		return rpsVal;
	}
	public void setRock(int rock) {
		this.rock = rock;
	}
	public void setPaper(int paper) {
		this.paper = paper;
	}
	public void setScissors(int scissors) {
		this.scissors = scissors;
	}
	public int setRpsVal(int val) {
		return val;
		
	}
	public int getComVal() {
		return comVal;
	}
	public int setComVal() {
		this.comVal = (int) (Math.random()*3+1); //1부터 3까지 나온다.
		return comVal;
	}
	
	
}
