package polymorphismTest;
/**
 * 
 * @file_name  : Bank.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 25.
 * @story      :
 */
import java.util.Scanner;

public class BankService implements Bank {
	private int restMoney = 0;
	private String result = "";
	private String rest = "";
	private String Massage = "";
	private static BankService service = new BankService();
	
	
	public static BankService getService() {
		return service;
	}

	@Override // 입금
	public String deposit(int inMoney) {
		restMoney = inMoney + restMoney; //기본 잔액에서 입금한 것.	
		String rest = "잔액: "+restMoney;
		return rest;
	}

	@Override // 계좌조회
	public String search() {
	return "남은 금액은 "+restMoney;
	}

	@Override // 출금
	public String withdraw(int outMoney) {
		String Massage = "";
		if (restMoney<0) {Massage = "잔액이 부족합니다.";
		}
		
		else{restMoney = restMoney - outMoney;
		Massage = ("잔액: "+restMoney);
			}
		return Massage;
		}
	
	
	@Override // 계좌 개설
	public String open(int password, String accountName) {
		int accountNo = (int) (Math.random() * 999999) + 100000;
		result = ("계좌주: \n"+accountName+"\n비밀번호: \n"+password+"\n계좌번호: \n"+accountNo+"\n잔액: \n"+restMoney);
		return result;
		} 
	

}
