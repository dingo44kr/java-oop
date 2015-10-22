package encapsule;

import java.util.Scanner;

/**
 * @file_name  : AccountBank.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 24.
 * @story      : 은행의 업무를 집어넣기
 */
public class AccountBankService {
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

	public void setRestMoney(int restMoney) { //통장을 개설하고 잔액을 보여주는 함수
		this.restMoney = restMoney;
	}
	public String data() {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름을 입력해주세요");
	String accountName = scanner.next();
	System.out.println("비밀번호를 입력해주세요");
	int password = scanner.nextInt();
	
	int accountNo = (int) (Math.random() * 999999) + 100000;
	
	restMoney = 0;
	result = ("계좌주: \n"+accountName+"\n비밀번호: \n"+password+"\n계좌번호: \n"+accountNo+"\n잔액: \n"+restMoney);
	return result;
	}

	//=============================================================================================
	
	String resultdeposit = "";
	
	public void deposit(){}
	
////	public int deposittool() {
//		// TODO Auto-generated method stub
//		AccountTool tool = new AccountTool();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("입금하실 금액은?");
//		int deposit = scanner.nextInt();
//		// System.out.println("금액을 투입구로 넣어주세요");
//
//		int derestmoney = 0;
//
//		tool.setRestMoney(tool.getRestMoney() + deposit);
//
//		}
//		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return resultdeposit;
		
	} 

}

