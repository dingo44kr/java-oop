package encapsule;

import java.util.Scanner;

public class AccountTool {

//	private String accountNo; // 계좌번호
//	private String ownerName; // 계좌주인
//	private String password; // 통장비번
//	private int restMoney; // 잔액
//	public static final String Bank_NAME = "한빛뱅크";
//	/**
//	 * 생성자를 만드시오.
//	 * 단, 통장을 만듦과 동시에
//	 * 은행 이름이 통장 바깥에 새겨지며(상수)
//	 * 계좌 번호는 랜덤숫자로 만들어지며(총 6자리로 합시다)
//	 * 계좌 주인의 이름은 새겨지며
//	 * 비번도 설정합니다.
//	 * (int) (Math.random()*13) + 1
//	 */
	private String result = "";
	private int restMoney = 0;
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public int getRestMoney() {
		return restMoney;
	}

	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}

	public void data() {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름을 입력해주세요");
	String accountName = scanner.next();
	System.out.println("비밀번호를 입력해주세요");
	int password = scanner.nextInt();
	
	int accountNo = (int) (Math.random() * 999999) + 100000;
	
	restMoney = 0;
	

	
	result = ("계좌주: \n"+accountName+"\n비밀번호: \n"+password+"\n계좌번호: \n"+accountNo+"\n잔액: \n"+restMoney);
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return result;
		}
}
