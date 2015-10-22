package polymorphismTest;
/**
 * 
 * @file_name  : Bank.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 25.
 * @story      :
 */
import java.util.Scanner;

public class HanbitBank {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	BankService service = BankService.getService();
	Account a = new Account();
	
	while (true) { // 무한루프를 사용할 때는 WhileLoop을 사용한다.
		System.out.println("원하는 업무를 선택해주세요\n "
				+ "1: 통장개설 2: 잔액조회 3: 입금 4: 출금 5: 정지");
		int key = scanner.nextInt();
		
		switch (key) {
		case 1: // 통장개설
			System.out.println("이름을 입력해주세요");
			String accountName = scanner.next();
			System.out.println("비밀번호를 입력해주세요");
			int password = scanner.nextInt();
			System.out.println(service.open(password, accountName));
			break;
		case 2: // 잔액조회
			System.out.println(service.search());
			break;
		case 3: // 입금
			System.out.println("입금할 금액을 입력해 주세요.");
			int inMoney = scanner.nextInt();
			System.out.println(service.deposit(inMoney));
			break;
		case 4: // 출금
			System.out.println("출금할 금액을 입력해 주세요.");
			int outMoney = scanner.nextInt();
			System.out.println(service.withdraw(outMoney));
			break;
		case 5: // 정지
			return;

		default: break;
		}
		
		}

	
	}
}