package encapsule;

import java.util.Scanner;

/**
 * @file_name  : Account.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 24.
 * @story      : 통장개설 프로그램
 */
public class Account {
//	private String accountNo; // 계좌번호
//	private String ownerName; // 계좌주인
//	private String password; // 통장비번
//	private int restMoney; // 잔액
//	public static final String Bank_NAME = "한빛뱅크";
	/**
	 * 생성자를 만드시오.
	 * 단, 통장을 만듦과 동시에
	 * 은행 이름이 통장 바깥에 새겨지며(상수)
	 * 계좌 번호는 랜덤숫자로 만들어지며(총 6자리로 합시다)
	 * 계좌 주인의 이름은 새겨지며
	 * 비번도 설정합니다.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AccountTool tool = new AccountTool();
		System.out.println(tool.toString());
		tool.data();
		
		
		AccountDeposit deposit = new AccountDeposit();
		AccountWithDraw withDraw = new AccountWithDraw();
		withDraw.withdrawtool();
		
		int key = 0;
		int allResult = 0;
		
		while (true) { // 무한루프를 사용할 때는 WhileLoop을 사용한다.
			System.out.println("원하는 업무를 선택해주세요\n "
					+ "1: 통장개설 2: 잔액조회 3: 입금 4: 출금 5: 정지");
			key = scanner.nextInt();
//			
//		switch (key) {
//		case 3:
//			allResult = deposit.deposittool(); break;
//			
////		case 4:
//			break;
//		case 5:
//		default:
//			break;
//		}

		
		
	}
}

}