package encapsule;

import java.util.Scanner;

public class AccountDeposit {

	String resultdeposit = "";
	
	public String getResultdeposit() {
		return resultdeposit;
	}

	public void setResultdeposit(String resultdeposit) {
		this.resultdeposit = resultdeposit;
	}

//	public int deposittool() {
		// TODO Auto-generated method stub
		AccountTool tool = new AccountTool();
		Scanner scanner = new Scanner(System.in);
//		System.out.println("입금하실 금액은?");
		int deposit = scanner.nextInt();
		//System.out.println("금액을 투입구로 넣어주세요");
		
		int derestmoney = 0;
		
//		tool.setRestmoney(tool.getRestMoney() + deposit);
		
		

		
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return resultdeposit;
	}
	
}
